public class ComissionadoAssalariado extends Comissionado{

    private double salarioBase;
    private final double  BONUS = 1.10;

    public ComissionadoAssalariado(String nome, double vendas, double percentual, double salarioBase) {
        super(nome, vendas, percentual);
        this.salarioBase = salarioBase;
    }

    @Override
    public double getValorPagamento() {
        return (salarioBase * BONUS) + super.getValorPagamento();
    }
}
