public class Comissionado extends Funcionario {
    
    private double vendas;
    private double percentual;

    public Comissionado(String nome, double percentual, double vendas) {
        super(nome);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double getValorPagamento() {
        return percentual * vendas;
    }
}
