public class Main {
    public static void main(String[] args) {
        Assalariado funcionario1 = new Assalariado(2000, 500);
        Comissionado funcionario2 = new Comissionado(0);
        ComissionadoAssalariado funcionario3 = new ComissionadoAssalariado(2000);

        double salarioComHorasExtras = funcionario1.getValorPagamento(2000, 4, 200);

        System.out.println("Salário bruto de funcionário assalariado: R$" + funcionario1.getSalarioBase());
        System.out.println("Valor das horas extras: R$" + salarioComHorasExtras);
        System.out.println("Salario final: R$" + (funcionario1.getSalarioBase() + salarioComHorasExtras) + "\n");
        System.out.printf("----------------------------------------------------\n");

        System.out.println("Salário do funcinário comissionado sobre suas vendas: R$" + (funcionario2.aplicarComissaoVendas(50000, 5)) + "\n");
        System.out.printf("----------------------------------------------------\n");

        double salarioComComissaoDeVendas = funcionario3.aplicarComissaoVendas(30000, 5);
        System.out.println("Salário base do funcionário comissionado/assalariado: R$" + funcionario3.getSalarioBase());
        System.out.println("Salário do funcionário sobre suas vendas: R$" + salarioComComissaoDeVendas);
        System.out.println("Salário total: R$" + (funcionario3.getSalarioBase() + salarioComComissaoDeVendas));
        

    }
}
