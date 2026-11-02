public class HorasTrabalhadasException extends Exception {
    public HorasTrabalhadasException(String msg) {
        super(msg);
    }
}

class ExcessoDeJornadaException extends Exception {
    public ExcessoDeJornadaException(String msg) {
        super(msg);
    }
}

class DadosInvalidosException extends IllegalArgumentException {
    public DadosInvalidosException(String msg) {
        super(msg);
    }
}

class FalhaProcessamentoFolhaException extends Exception {
    public FalhaProcessamentoFolhaException(String msg, Throwable causa) {
        super(msg, causa);
    }
}