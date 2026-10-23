public class Assalariado extends Funcionario {
    private double salarioSemanal;

    public Assalariado(String nome, double salarioSemanal) {
        super(nome);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double getValorPagamento() {
        return salarioSemanal;
    }
}
