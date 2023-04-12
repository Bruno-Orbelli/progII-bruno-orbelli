package excepciones;

public class ParametroInexistenteException extends Exception {
    public ParametroInexistenteException() {
    }

    public ParametroInexistenteException(String message) {
        super(message);
    }
}
