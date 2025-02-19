package Herencia.Practica1;

import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

import static Herencia.Practica1.Tienda.llave;

@Getter
public class Bizum extends MetodoPago{

    Random random = new Random();
    Scanner ent = new Scanner(System.in);

    public static final int TELEFONO_MAX = 9;
    public static final int PIN_MAX = 6;

    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        generarPin();
        System.out.println("El pin : ["+pin+"]");
    }

    public Bizum(){
        Bizum prueba = new Bizum(preguntarTelefono());
        if(validarBizum(prueba.getTelefono(), prueba.getPin())){
            this.telefono = prueba.getTelefono();
            this.pin = prueba.getPin();
            llave = true;
        } else {
            System.err.println("ERROR. DATOS ERRÓNEOS...");
        }
    }

    public void generarPin(){
        for (int i = 0; i < PIN_MAX; i++) {
            pin = pin*10 + random.nextInt(10);
        }
    }

    public boolean preguntarPin(int pin){
        System.out.println("Introduce el pin: ");
        if (ent.next().equals(Integer.toString(pin))) {
            return true;
        }
        return false;
    }

    public String preguntarTelefono(){
        System.out.println("Introduce tu número de teléfono: ");
        return ent.next();
    }

    public boolean validarBizum(String telefono, int pin) {
        System.out.println("Validando bizum...");
        if (telefono.length()!=TELEFONO_MAX){
            System.out.println("ERROR... El número de teléfono debe tener "+TELEFONO_MAX+" dígitos");
            return false;
        } else if (!telefono.matches("\\d+")) {
            System.out.println("ERROR... El número de teléfono solo puede contener números");
            return false;
        } else if (!preguntarPin(pin)) {
            System.out.println("ERROR. Pin incorrecto");
            return false;
        }
        System.out.println("Datos válidos");
        return true;
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con Bizum");
    }
}
