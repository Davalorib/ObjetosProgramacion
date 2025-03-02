package Herencia.Practica2;

public class NumExcepcion extends RuntimeException {

    public NumExcepcion() {
        super("Ese número de dorsal ya está pillado");
    }

}
