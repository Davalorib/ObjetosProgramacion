package Herencia.Practica1;

import lombok.Getter;

import java.util.Arrays;

@Getter //para los getters
public class TarjetaCredito extends MetodoPago{

    public static final String[] TIPO_DEF = {"VISA", "MASTERCARD", "MAESTRO"}; //un vector string que contiene las posibles tarjetas
    public static final int TARJETA_MAX = 16; //la cantidad de numeros que debe tener la tarjeta

    private String nro_tarjeta; //el numero de la tarjeta
    private String tipo; //el tipo de la tarjeta

    //el constructor
    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo.toUpperCase(); //lo paso a mayusculas para ahorrar problemas
    }
    //

    //este metodo booleano valida los datos de la tarjeta. Si algo está mal devuelve false
    public boolean validarTarjeta(){
        System.out.println("Validando tarjeta...");
        if (this.nro_tarjeta.length()!=TARJETA_MAX){ //comprueba que mida 16 el numero de la tarjeta
            System.out.println("ERROR... La tarjeta debe tener "+TARJETA_MAX+" dígitos");
            return false;
        } else if (!this.nro_tarjeta.matches("\\d+")) { //comprueba que sean dígitos
            System.out.println("ERROR... La tarjeta solo puede contener números");
            return false;
        } else if (!Arrays.asList(TIPO_DEF).contains(this.tipo)) { //comprueba que el tipo sea alguno de los válidos
            System.out.println("ERROR... La tarjeta solo puede ser [VISA, MASTERCARD, MAESTRO]");
            return false;
        }
        System.out.println("Tarjeta válida");
        return true;
    }

    //el metodo que procesa el pago.
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con tarjeta de crédito "+tipo);
        System.out.println("Pago aceptado. Muchas gracias");
    }
    //
}