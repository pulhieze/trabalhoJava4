package src.employees;
import src.excecoes.DadosInvalidosException;
import src.excecoes.ExcessoDeJornadaException;

public class Horista extends Funcionario {
    private static final double HORAS_DE_TRABALHO = 8;
    private static final double LIMITE_EXTRA_DIARIA = 2;
    private static final double LIMITE_SEMANAL = 40;
    private static final double PERCENTUAL_HORAS_EXTRAS = 1.5;

    private boolean horasExtrasTrabalhadas;
    private double valorDaHora;
    private double totalDeHoras;
    private double jornadaDiaria;

    public Horista(String nome, double valorDaHora, double jornadaDiaria) {
        super(nome);
        this.valorDaHora = valorDaHora;
        this.jornadaDiaria = jornadaDiaria;

        if (this.valorDaHora < 0) {
            throw new DadosInvalidosException("Erro: vendas não pode ser abaixo de zero");
        } 
    }

    public void regitrarJornadaDiaria() throws ExcessoDeJornadaException {
        if (jornadaDiaria > (HORAS_DE_TRABALHO + LIMITE_EXTRA_DIARIA)) {
            throw new ExcessoDeJornadaException(
                getNome() + " já atingiu a jornada diária de trabalho: " + jornadaDiaria + " horas"
            );
        }

        if (jornadaDiaria > HORAS_DE_TRABALHO) {
           horasExtrasTrabalhadas = true;
        }

        totalDeHoras += jornadaDiaria;
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
