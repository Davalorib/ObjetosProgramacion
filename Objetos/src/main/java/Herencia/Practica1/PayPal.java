package Herencia.Practica1;

public class PayPal extends MetodoPago{

    public static final String FORMATO = "blabla@blabla.com";
    public static final double SALDO_DEF = 23;

    private String correo;
    private double saldo;

    public PayPal(String correo) {
        this.correo = correo;
        this.saldo = 23;
    }

    public boolean validarPayPal(){

        return true;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de [importe] € con PayPal");
    }
}
