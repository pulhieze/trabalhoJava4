public class Horista extends Funcionario {
    private static final double HORAS_DE_TRABALHO = 8;
    private static final double LIMITE_EXTRA_DIARIA = 2;
    private static final double LIMITE_SEMANAL = 40;
    private static final double PERCENTUAL_HORAS_EXTRAS = 1.5;

    private boolean horasExtrasTrabalhadas;
    private double valorDaHora;
    private double totalDeHoras;
    private double jornadaDiaria;

    public Horista(String nome, double valorDaHora) {
        super(nome);

        if (this.valorDaHora < 0) {
            throw new DadosInvalidosException("Erro: vendas não pode ser abaixo de zero");
        }

        this.valorDaHora = valorDaHora;
    }

    public void regitrarJornadaDiaria(double horasTrabalhadas) throws ExcessoDeJornadaException {
        if (horasTrabalhadas > HORAS_DE_TRABALHO) {
            throw new ExcessoDeJornadaException(
                getNome() + " já atingiu a jornada diária de trabalho: " + horasTrabalhadas + " horas"
            );
        }

        jornadaDiaria += horasTrabalhadas;
    }

    @Override
    public double getValorPagamento() {
        if (totalDeHoras <= LIMITE_SEMANAL) {
            return totalDeHoras * valorDaHora;
        }

        double horasNormais = LIMITE_SEMANAL * valorDaHora;
        double horasExtras = (totalDeHoras - LIMITE_SEMANAL) * valorDaHora * PERCENTUAL_HORAS_EXTRAS;

        return horasNormais + horasExtras;
    }

    @Override
    public boolean teveHoraExtra() {
        return horasExtrasTrabalhadas;
    }

    public double getTotalDeHoras() {
        return totalDeHoras;   
    }

    public double getJornadaDiaria() {
        return jornadaDiaria;
    }
}
