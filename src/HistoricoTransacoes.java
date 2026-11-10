package src;
import java.util.ArrayDeque;
import java.util.Deque;

public class HistoricoTransacoes {
    static Deque<Pagavel> pilhaPagavel = new ArrayDeque<Pagavel>();

    public void registrarPilha(Pagavel itemPago) {
        pilhaPagavel.push(itemPago);
    }

    public int estornar() {
        int estornados = 0;

        while(!pilhaPagavel.isEmpty()) {
            Pagavel item = pilhaPagavel.pop();
            estornados++;

            System.out.println("Estornados: " + item);
        }

        return estornados;
    }
}
