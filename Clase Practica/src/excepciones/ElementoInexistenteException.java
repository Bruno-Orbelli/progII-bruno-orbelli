package excepciones;

public class ElementoInexistenteException extends Exception {
    public ElementoInexistenteException() {
    }

    public ElementoInexistenteException(String message) {
        super(message);
    }
}
