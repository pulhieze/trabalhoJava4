public class ComissionadoAssalariado extends Comissionado{

    private double salarioBase;
    private final double BONUS = 1.10;

    public ComissionadoAssalariado(String nome, double vendas, double percentual, double salarioBase) {
        super(nome, vendas, percentual);
        this.salarioBase = salarioBase;

        if (this.salarioBase < 0) {
            throw new DadosInvalidosException("Erro: salário não pode ser abaixo de zero");
        }

        if (vendas < 0) {
            throw new DadosInvalidosException("Erro: vendas não pode ser abaixo de zero");
        }
    }

    @Override
    public double getValorPagamento() {
        return (salarioBase * BONUS) + super.getValorPagamento();
    }
}
