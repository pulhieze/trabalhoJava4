package pagamento;

import java.util.ArrayList;

import employees.Horista;
import excecoes.DadosInvalidosException;
import excecoes.ExcessoDeJornadaException;
import excecoes.FalhaProcessamentoException;

public class ParyrollService {
    ArrayList<String> auditoria = new ArrayList<>();

    public void registrarHoraDeTrabalho(Horista horista, int horas) throws FalhaProcessamentoException {
        try {
            horista.regitrarJornadaDiaria(horas);
        } catch (ExcessoDeJornadaException e){
            auditoria.add("Pendência trabalhista: " + 
            horista.getNome() + " executou " + 
            e.getHoras() + " horas de trabalho\n" + 
            "Limite: " + e.getLimiteHoras());
        
            new FalhaProcessamentoException("Falha no registro da jornada de: " + horista.getNome(), e);
        }
    }

    public void processarLote(Pagavel[] lote) throws FalhaProcessamentoException {
        HistoricoTransacoes historico = new HistoricoTransacoes();
        
        int estornadas = 0;
        int concluidas = 0;

        try {
            for(Pagavel item : lote) {
                pagar(item);
                historico.empilhar(item);
                concluidas++;
            }

        } catch (DadosInvalidosException e) {
            System.out.println("Erro no processamento do lote: " + e.getMessage());
            System.out.println("Iniciando o Rollback...");

            historico.desempilhar();

        } finally {
            System.out.println("Auditoria: ");
            System.out.println("Operações concluidas: " + concluidas);
            System.out.println("Operações estornadas: " + estornadas);
            System.out.println("Tamanho restante da pilha: " + historico.tamanhoHistorico());
        }
    }

    public void pagar(Pagavel item) {
        if (item.getValorPagamento() <= 0) {
            throw new DadosInvalidosException("Pagamento inválido (R$ 0,00): " + item);
        }
    }
}
