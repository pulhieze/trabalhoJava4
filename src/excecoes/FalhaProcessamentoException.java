package excecoes;

public class FalhaProcessamentoException extends Exception {
    public FalhaProcessamentoException(String msg, Throwable causa) {
        super(msg, causa);
    }
} 
