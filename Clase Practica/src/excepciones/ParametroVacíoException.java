package excepciones;

public class ParametroVacíoException extends Exception {
    public ParametroVacíoException() {
    }

    public ParametroVacíoException(String message) {
        super(message);
    }
}
