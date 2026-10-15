public class ComissionadoAssalariado extends Funcionario{
    public ComissionadoAssalariado(double salarioBase) {
        super(salarioBase);
    }

    public double aplicarComissaoVendas(int valorProdutosVendidos, double porcentagemComissao) {
        return valorProdutosVendidos * (porcentagemComissao / 100);
    }
}
