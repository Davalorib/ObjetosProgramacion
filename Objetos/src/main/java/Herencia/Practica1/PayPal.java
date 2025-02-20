package Herencia.Practica1;

import lombok.Getter;

@Getter //para los getters
public class PayPal extends MetodoPago{

    public static final String FORMATO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$"; //el formato de correo
    public static final double SALDO_DEF = 23; //el saldo por defecto

    private String correo; //el correo
    private double saldo; //el saldo

    //el constructor
    public PayPal(String correo, double saldo) {
        this.correo = correo;
        ponerSaldo(saldo); //llamamos a ponerSaldo para saber qué valor darle al saldo
    }
    //

    //este metodo pone el saldo por defecto si le pasamos un 0, sino le pone lo que hemos pasado
    public void ponerSaldo(double saldo){
        if (saldo == 0){
            this.saldo = SALDO_DEF;
        } else {
            this.saldo = saldo;
        }
    }
    //

    //este metodo booleano valida el formato del correo del PayPal. Si está mal devuelve false
    public boolean validarPayPal(){
        if (!correo.matches(FORMATO)){
            System.out.println("ERROR... El correo no es válido");
            return false;
        }
        return true;
    }
    //

    //este metodo booleano valida el saldo del PayPal. Si nuestro saldo es menor devuelve false
    public boolean validarSaldo(double importe){
        if (saldo<importe){
            return false;
        }
        return true;
    }
    //

    //el metodo que procesa el pago. Si validarSaldo nos devuelve true acepta el pago, sino nos dice que somos pobres
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con PayPal");
        if (validarSaldo(importe)){
            System.out.println("Pago aceptado. Muchas gracias");
        } else {
            System.out.println("Pago rechazado. No tienes suficiente dinero");
        }
    }
    //
}