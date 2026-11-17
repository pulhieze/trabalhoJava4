import java.util.ArrayList;
import excecoes.ExcessoDeJornadaException;
import excecoes.FalhaProcessamentoException;
import employees.Assalariado;
import employees.Horista;
import pagamento.Pagavel;
import pagamento.ParyrollService;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagavel> folha = new ArrayList<>();
        Horista horista = new Horista("Marcelo", 40);
        Assalariado assalariado = new Assalariado("José", 400);

        cenario1(horista, assalariado, folha);
        cenario2(horista);     
        cenario3();   
    }

    public static void cenario1(Horista horista, Assalariado assalariado, ArrayList<Pagavel> folha) {
        titulo(1);

        try{
            horista.regitrarJornadaDiaria(8);
        } catch (ExcessoDeJornadaException e) {
            System.out.println(e.getMessage());
        }
        
        folha.add(horista);
        folha.add(assalariado);

        for (Pagavel pagavel : folha) {
            System.out.println(pagavel);
        }
    }

    public static void cenario2(Horista horista) {
        titulo(2);

        ParyrollService service = new ParyrollService();
        
        try {
            service.registrarHoraDeTrabalho(horista, 14);
        } catch (ExcessoDeJornadaException e) {
            System.out.println("erro");
        }

        System.out.println("Estado final");
        System.out.println("Auditoria trabalhista: \n" + service.getAuditoria());
    }

    public static void cenario3() {
        titulo(3);

        ParyrollService service = new ParyrollService();

        Pagavel[] lote = {
            new Assalariado("José", 400),
            new Assalariado("Ana", 2000),
            new Horista("Sem Horas", 40),
            new Assalariado("Pedro", 1500)
        };

        try {
            service.processarLote(lote);
        } catch (FalhaProcessamentoException e) {
            System.out.println("Erro");
        }
    }

    public static void titulo(int numeroTitulo) {
        System.out.println("\n==================== CENARIO " + numeroTitulo + " ====================\n");
    }
}
