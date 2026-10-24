import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Horista horista = new Horista("Marcelo", 40);        

        // Tratamento de Exceção
        try {
            horista.registrarHorasDeTrabalho(10);
            horista.registrarHorasDeTrabalho(10);
            horista.registrarHorasDeTrabalho(10);
            horista.registrarHorasDeTrabalho(10);

        } catch (HorasTrabalhadasException e) {
            System.out.println("Erro trabalhista: " + e.getMessage());
        }

        ArrayList<Pagavel> folha = new ArrayList<>();

        folha.add(new Assalariado("José", 400));
        folha.add(new Comissionado("Marcela", 0.05, 30000));
        folha.add(new ComissionadoAssalariado("Carla", 35000, 0.05, 2000));
        folha.add(new Fatura("Folha", 3, 150));

        System.out.println("===== FOLHA DE PAGAMENTO =====");

        for (Pagavel pagavel : folha) {
            System.out.println(pagavel);
        }
    }
}
