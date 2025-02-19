package Herencia.Practica1;

import java.util.Scanner;

public class Tienda {

    static Scanner ent = new Scanner(System.in);
    public static boolean llave;

    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }

    public static void iniciarPago(){

        MetodoPago metodo = null;
        double importe;
        llave = false;

        System.out.println("\nElige un método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. Paypal");
        System.out.println("3. Bizum");
        String elec = ent.next();

        switch (elec){
            case "1":
                metodo = new TarjetaCredito();
                break;
            case "2":
                System.out.println("Paypal");
                break;
            case "3":
                metodo = new Bizum();
                break;
            default:
                System.err.println("ERROR... Elige un método de pago válido");
                break;
        }

        if (llave) {
            System.out.println("Introduce el importe: ");
            importe = ent.nextDouble();
            realizarPago(metodo, importe);
            System.out.println("Pago aceptado. Muchas gracias");
        }
    }
}
