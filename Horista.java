public class Horista extends Funcionario {
    private static final double HORAS_DE_TRABALHO = 8;
    private static final double LIMITE_EXTRA_DIARIA = 2;
    private static final double LIMITE_SEMANAL = 40;
    private static final double PERCENTUAL_HORAS_EXTRAS = 1.5;

    private double horasExtras;
    private double valorDaHora;
    private double horasTrabalhadas;

    public Horista(String nome) {
        super(nome);
    }

}
