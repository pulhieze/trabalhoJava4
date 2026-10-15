public class Comissionado extends Funcionario {
    
    int valorProdutosVendidos;

    public Comissionado(double salarioBase) {
        super(salarioBase);
    }

    public double aplicarComissaoVendas(int valorProdutosVendidos, double porcentagemComissao) {
        return valorProdutosVendidos * (porcentagemComissao / 100);
    }
}
