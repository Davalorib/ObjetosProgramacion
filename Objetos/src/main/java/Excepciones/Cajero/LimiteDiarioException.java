package Excepciones.Cajero;

public class LimiteDiarioException extends RuntimeException {

    public LimiteDiarioException() {
        super("No se puede más de 600€");
    }

}
