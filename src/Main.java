import java.util.ArrayList;
import excecoes.ExcessoDeJornadaException;
import employees.Assalariado;
import employees.Horista;
import pagamento.Pagavel;
import pagamento.ParyrollService;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagavel> folha = new ArrayList<>();
        Horista horista = new Horista("Marcelo", 40);
        Assalariado assalariado = new Assalariado("José", 400);

        cenario1(horista, assalariado, folha);        
    }

    public static void cenario1(Horista horista, Assalariado assalariado, ArrayList<Pagavel> folha) {
        System.out.println("========== FOLHA DE PAGAMENTO ==========\n");

        try{
            horista.regitrarJornadaDiaria(8);
        } catch (ExcessoDeJornadaException e) {
            System.out.println(e.getMessage());
        }
        

        folha.add(horista);
        folha.add(assalariado);

        for (Pagavel pagavel : folha) {
            System.out.println(pagavel);
        }
    }

    public static void cenario2(Horista horista, ArrayList<Pagavel> folha) {
        System.out.println("========== FOLHA DE PAGAMENTO ==========\n");

        ParyrollService service = new ParyrollService();

        
    }
}
