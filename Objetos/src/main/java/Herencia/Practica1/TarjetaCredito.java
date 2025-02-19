package Herencia.Practica1;

import lombok.Getter;

import java.util.Arrays;
import java.util.Scanner;

import static Herencia.Practica1.Tienda.llave;

@Getter
public class TarjetaCredito extends MetodoPago{

    Scanner ent = new Scanner(System.in);

    public static final String[] TIPO_DEF = {"VISA", "MASTERCARD", "MAESTRO"};
    public static final int TARJETA_MAX = 16;

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo.toUpperCase();
    }

    public TarjetaCredito() {
        TarjetaCredito prueba = new TarjetaCredito(preguntarTarjeta(),preguntarTipo());
        if(validarTarjeta(prueba.getNro_tarjeta(),prueba.getTipo())){
            this.nro_tarjeta = prueba.getNro_tarjeta();
            this.tipo = prueba.getTipo();
            llave = true;
        } else {
            System.err.println("ERROR. DATOS ERRÓNEOS...");
        }
    }

    public boolean validarTarjeta(String num, String type){
        System.out.println("Validando tarjeta...");
        if (num.length()!=TARJETA_MAX){
            System.out.println("ERROR... La tarjeta debe tener "+TARJETA_MAX+" dígitos");
            return false;
        } else if (!num.matches("\\d+")) {
            System.out.println("ERROR... La tarjeta solo puede contener números");
            return false;
        } else if (!Arrays.asList(TIPO_DEF).contains(type)) {
            System.out.println("ERROR... La tarjeta solo puede ser [VISA, MASTERCARD, MAESTRO]");
            return false;
        }
        System.out.println("Tarjeta válida");
        return true;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con tarjeta de crédito "+tipo);
    }

    public String preguntarTarjeta(){
        System.out.println("Introduce el número de tarjeta: ");
        return ent.next();
    }

    public String preguntarTipo(){
        System.out.println("Introduce el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]: ");
        return ent.next();
    }
}
