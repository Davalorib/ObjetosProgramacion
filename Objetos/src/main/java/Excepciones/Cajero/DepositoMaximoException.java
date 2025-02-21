package Excepciones.Cajero;

public class DepositoMaximoException extends RuntimeException {

    public DepositoMaximoException() {
        super("No se puede más de 3000€");
    }

}
