package Excepciones.Cajero;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {
        super("Eres pobre tt");
    }

}