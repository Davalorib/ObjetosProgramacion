package Excepciones;

public class NvlMaxException extends RuntimeException {
    public NvlMaxException(String mensaje) {
        super(mensaje);
    }
}
