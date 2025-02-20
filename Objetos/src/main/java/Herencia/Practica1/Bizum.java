package Herencia.Practica1;

import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

@Getter //para los getters
public class Bizum extends MetodoPago{

    Random random = new Random(); //el random
    Scanner ent = new Scanner(System.in); //el scanner

    public static final int TELEFONO_MAX = 9; //la cantidad de numeros que debe tener nuestro telefono
    public static final int PIN_MAX = 6; //la cantidad de numeros del pin

    private String telefono; //el telefono
    private int pin; //el pin

    //el constructor
    public Bizum(String telefono) {
        this.telefono = telefono;
        generarPin(); //generamos el pin y lo mostramos por pantalla
    }
    //

    //este metodo genera un pin de 6 digitos, ya que nuestra constante es de 6
    public void generarPin(){
        for (int i = 0; i < PIN_MAX; i++) {
            pin = pin*10 + random.nextInt(10); //multiplico el pin*10 para moverlo a la izquierda
        }
        System.out.println("El pin: ["+pin+"]");
    }
    //

    //este metodo booleano pregunta el pin, si es igual devuelve true, sino false (lo pido en String y convierto el pin para ahorrarme un try-catch xd)
    public boolean preguntarPin(int pin){
        System.out.println("Introduce el pin: ");
        if (ent.next().equals(Integer.toString(pin))) {
            return true;
        }
        return false;
    }
    //

    //este metodo booleano valida los datos del Bizum. Si algo está mal devuelve false
    public boolean validarBizum() {
        System.out.println("Validando bizum...");
        if (this.telefono.length()!=TELEFONO_MAX){ //comprueba que mida 9 el telefono
            System.out.println("ERROR... El número de teléfono debe tener "+TELEFONO_MAX+" dígitos");
            return false;
        } else if (!this.telefono.matches("\\d+")) { //comprueba que sean dígitos
            System.out.println("ERROR... El número de teléfono solo puede contener números");
            return false;
        } else if (!preguntarPin(this.pin)) { //pregunta el pin, si devuelve false es incorrecto
            System.out.println("ERROR. Pin incorrecto");
            return false;
        }
        System.out.println("Datos válidos");
        return true;
    }

    //el metodo que procesa el pago.
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de ["+importe+"]€ con Bizum");
        System.out.println("Pago aceptado. Muchas gracias");
    }
    //
}