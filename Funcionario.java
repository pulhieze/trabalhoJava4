public abstract class Funcionario implements Pagavel{
    private String nome;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean teveHoraExtra() {
        return false;
    }

    @Override
    public double getValorPagamento() {
        return 0.0;
    }

    @Override
    public String toString() {
        return nome + " | R$" + String.format("%.2f", getValorPagamento());
    }
}
