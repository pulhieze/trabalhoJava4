package pagamento;
import java.util.ArrayDeque;
import java.util.Deque;


public class HistoricoTransacoes {
    static Deque<Pagavel> historico = new ArrayDeque();

    public void empilhar(Pagavel item) {
        historico.push(item);
    }

    public int desempilhar() {
        int estornados = 0;

        while (!historico.isEmpty()) {
            historico.pop();
            estornados++;

            System.out.println("Itens estornados" + estornados);
        }

        return estornados;
    }

    public int tamanhoHistorico() {
        return historico.size();
    }
}
