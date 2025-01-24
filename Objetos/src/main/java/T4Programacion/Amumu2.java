package T4Programacion;

import java.util.Scanner;

public class Amumu2 {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Paco");
        Estudiante e2 = new Estudiante("Paco", "1ºDAW","pueshola53@alu.edu.gva.es");
        System.out.println(e1);
        System.out.println(e2);
        if (Estudiante.validar(e2.getEmail())){
            System.out.println("Buen email tt");
        } else {
            System.out.println("No me gusta tu email");
        }

    }
}
