import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagavel> folha = new ArrayList<>();
        Horista horista = new Horista("Marcelo", 40);
        Assalariado assalariado = new Assalariado("José", 400);

        
        cenario1(horista, assalariado, folha);
        
    }

    public static void cenario1(Horista horista, Assalariado assalariado, ArrayList<Pagavel> folha) {
        System.out.println("===== FOLHA DE PAGAMENTO =====");

        try{
            horista.regitrarJornadaDiaria(8);
        } catch (ExcessoDeJornadaException e) {
            e.getMessage();
        }
        

        folha.add(horista);
        folha.add(assalariado);

        for (Pagavel pagavel : folha) {
            System.out.println(pagavel);
        }
    }
}
