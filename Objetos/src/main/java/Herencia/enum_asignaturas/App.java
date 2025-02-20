package Herencia.enum_asignaturas;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);
        for (Asignaturas asignaturas:Asignaturas.values()){
            System.out.println("Asignatura "+asignaturas+" que tiene "+asignaturas.getHoras()+" horas anuales");
        }

        System.out.println("Introduce un módulo "+Arrays.toString(Asignaturas.values()));
        String modulo = ent.next();
        Asignaturas modulo_enun = Asignaturas.valueOf(modulo);
        System.out.println(modulo_enun);


        String ipe_string = ipe.name();
        System.out.println(ipe_string+" como string");

        int posi = Asignaturas.BASES.ordinal();
        System.out.println("Posición en el enum para BBDD "+posi);

    }

}
