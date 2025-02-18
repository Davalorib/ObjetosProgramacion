package Herencia.Practica1;

import lombok.Getter;

import java.util.Arrays;
import java.util.Scanner;

@Getter
public class TarjetaCredito extends MetodoPago{

    Scanner ent = new Scanner(System.in);

    public static final String[] TIPO_DEF = {"VISA", "MASTERCARD", "MAESTRO"};
    public static final int TARJETA_MAX = 16;

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito() {
        String a = preguntarTarjeta();
        String b = preguntarTipo();
        if(validarTarjeta(a,b)){
            this.nro_tarjeta = a;
            this.tipo = b;
        } else {
            System.out.println("DATOS ERRÓNEOS...");
        }
    }

    public boolean validarTarjeta(String num, String type){
        if (num.length()!=TARJETA_MAX){
            return false;
        } else if (!Arrays.asList(TIPO_DEF).contains(type)) {
            return false;
        }
        return true;
    }

    public void procesarPago(double importe) {
        System.out.println( "Procesando pago de ["+importe+"]€ con tarjeta de crédito "+tipo);
    }

    public String preguntarTarjeta(){
        System.out.println("Introduzca su número de tarjeta: ");
        return ent.next();
    }

    public String preguntarTipo(){
        System.out.println("Introduzca su tipo de tarjeta [VISA, MASTERCARD, MAESTRO]: ");
        return ent.next();
    }
}
