import java.util.ArrayDeque;
import java.util.Deque;

public class HistoricoTransacoes {
    Deque<Pagavel> pilhaPagavel = new ArrayDeque<Pagavel>();

    public void registrarPilha(Pagavel itemPago) {
        pilhaPagavel.push(itemPago);
    }
}
