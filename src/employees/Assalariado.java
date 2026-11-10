package employees;
import excecoes.DadosInvalidosException;

public class Assalariado extends Funcionario {
    private double salarioSemanal;

    public Assalariado(String nome, double salarioSemanal) {
        super(nome);
        this.salarioSemanal = salarioSemanal;

        if (this.salarioSemanal < 0) {
            throw new DadosInvalidosException("Erro: salário não pode ser abaixo de zero");
        }
    }

    @Override
    public double getValorPagamento() {
        return salarioSemanal;
    }
}
