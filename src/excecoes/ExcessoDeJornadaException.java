package excecoes;

public class ExcessoDeJornadaException extends Exception {

    String nome;
    int dia;
    double horas;
    double limiteHoras;

    public ExcessoDeJornadaException(String nome, int dia, double horas, double limiteHoras) {
        super("Funcionário: " + nome + "\nHora de trabalho: " + horas + "\nData: " + dia + "\nLimite de horas: " + limiteHoras + "\n");
        this.nome = nome;
        this.dia = dia;
        this.horas = horas;
        this.limiteHoras = limiteHoras;
    }

    public String getNome() {return nome;}
    public int getDia() {return dia;}
    public double getHoras() {return horas;}
    public double getLimiteHoras() {return limiteHoras;}
}