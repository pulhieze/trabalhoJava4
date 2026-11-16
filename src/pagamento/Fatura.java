package pagamento;

import excecoes.DadosInvalidosException;

public class Fatura implements Pagavel {

    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;

        if (this.quantidade <= 0) {
            throw new DadosInvalidosException("Erro: quantidade não pode ser menor do que zero");
        }

        if (this.precoUnitario < 0) {
            throw new DadosInvalidosException("Erro: preço unitário não pode ser menor que zero");
        }
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