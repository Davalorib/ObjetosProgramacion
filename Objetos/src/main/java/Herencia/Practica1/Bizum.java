package Herencia.Practica1;

import java.util.Random;

public class Bizum extends MetodoPago{

    Random random = new Random();

    public static final int TELEFONO_MAX = 9;
    public static final int PIN_MAX = 6;

    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = generarpin();
    }

    public int generarpin(){

        return 0;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de [importe] € con Bizum");
    }
}
