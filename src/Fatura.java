public class Fatura implements Pagavel {

    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double getValorPagamento() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "Fatura: " + descricao + " | R$" + String.format("%.2f", getValorPagamento());
    }
}