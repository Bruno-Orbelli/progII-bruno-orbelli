package excepciones;

public class CantidadDeParametrosIncorrectaException extends Exception {
    public CantidadDeParametrosIncorrectaException() {
    }

    public CantidadDeParametrosIncorrectaException(String message) {
        super(message);
    }
}
