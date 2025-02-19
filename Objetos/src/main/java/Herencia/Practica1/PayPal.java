package Herencia.Practica1;

public class PayPal extends MetodoPago{

    public static final String FORMATO = "david@gmail.com";
    public static final double SALDO_DEF = 23;

    private String correo;
    private double saldo;

    public PayPal(String correo) {
        this.correo = correo;
        this.saldo = SALDO_DEF;
    }

    public boolean validarPayPal(){
        if (!correo.matches(FORMATO)){
            System.out.println("ERROR... El correo no es válido");
            return false;
        }
        if (saldo<0){

        }
        return true;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con PayPal");
    }
}
