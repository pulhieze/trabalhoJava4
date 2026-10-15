public class Assalariado extends Funcionario {

    public Assalariado(double salarioBase) {
        super(salarioBase);
    }

    public double aplicarHorasExtras(double salarioBase, int horasTrabalhadas, int divisorDeHoras) {
        double valorHora = salarioBase / divisorDeHoras;
        double valorUnitario = valorHora * 1.5;
        return valorUnitario * horasTrabalhadas;
    }
}
