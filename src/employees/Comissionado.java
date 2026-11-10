package src.employees;
import src.excecoes.DadosInvalidosException;

public class Comissionado extends Funcionario {
    
    private double vendas;
    private double percentual;

    public Comissionado(String nome, double vendas, double percentual) {
        super(nome);
        this.vendas = vendas;
        this.percentual = percentual; // 0.05 -> 5%

        if (this.vendas < 0) {
            throw new DadosInvalidosException("Erro: vendas não pode ser abaixo de zero");
        }
        
        if (this.percentual < 0 || this.percentual > 1) {
            throw new DadosInvalidosException("Erro: percentual não pode ser abaixo de 0 ou acima de 1");
        }
    }

    @Override
    public double getValorPagamento() {
        return percentual * vendas;
    }
}
