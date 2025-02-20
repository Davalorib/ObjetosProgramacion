package Herencia.Practica1;

import java.util.Scanner;

public class Tienda {

    static Scanner ent = new Scanner(System.in);

    //el metodo que inicia el pago
    public static void iniciarPago(){

        MetodoPago metodo = null; //inicializo metodo que sino me chilla
        double importe; //el importe
        boolean si = false; //booleano para desbloquear el importe si los datos son correctos

        System.out.println("\n¿Qué método de pago quieres usar? [Bizum, PayPal, Tarjeta]");
        String elec = ent.next().toUpperCase(); //lo paso a mayusculas para ahorrar problemas

        //el switch
        switch (elec){
            case "BIZUM":
                System.out.println("Introduce tu número de teléfono: ");
                String telf = ent.next();
                Bizum bizum = new Bizum(telf); //creamos objeto Bizum
                if (bizum.validarBizum()){ //si la validacion es correcta guardamos el objeto en metodo y desbloqueamos el importe
                    metodo = bizum;
                    si = true;
                }
                break;

            case "PAYPAL":
                System.out.println("Introduce el correo de tu cuenta: ");
                String email = ent.next();
                System.out.println("Introduce el saldo de tu cuenta (0 para que se ponga por defecto): ");
                double saldo = ent.nextDouble();
                PayPal payPal = new PayPal(email, saldo); //creamos objeto PayPal
                if (payPal.validarPayPal()){ //si la validacion es correcta guardamos el objeto en metodo y desbloqueamos el importe
                    metodo = payPal;
                    si = true;
                }
                break;

            case "TARJETA":
                System.out.println("Introduce el número de tarjeta: ");
                String num = ent.next();
                System.out.println("Introduce el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]: ");
                String tipo = ent.next();
                TarjetaCredito tarjetaCredito = new TarjetaCredito(num,tipo); //creamos objeto TarjetaCredito
                if (tarjetaCredito.validarTarjeta()){ //si la validación es correcta guardamos el objeto en metodo y desbloqueamos el importe
                    metodo = tarjetaCredito;
                    si = true;
                }
                break;

            default:
                System.err.println("ERROR... Elige un método de pago válido");
                break;
        }

        //si la validación es correcta pedimos el importe y lanzamos el metodo realizarPago
        if (si) {
            System.out.println("Introduce el importe: ");
            importe = ent.nextDouble();
            realizarPago(metodo, importe);
        }
        //
    }
    //

    //el metodo que llama a procesarPago según el tipo de objeto que sea metodo
    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }
    //
}