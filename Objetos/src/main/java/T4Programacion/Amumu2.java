package T4Programacion;

import java.util.Scanner;

public class Amumu2 {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Yo");
        Estudiante e2 = new Estudiante("Yo", "1ºDAW","pueshola53@alu.edu.gva.es");
        System.out.println(e1);
        System.out.println(e2);
        if (Estudiante.validar(e2.getEmail())){
            System.out.println("Buen email tt");
        } else {
            System.out.println("No me gusta tu email");
        }
        System.out.println();
        Editorial ed1 = new Editorial("EditorialPedro","Marruecos");
        System.out.println(ed1);

        Libro l1 = new Libro("solo leveling","mipadre",ed1);
        System.out.println(l1);
        System.out.println(ed1);
        System.out.println();

        Libro l2 = new Libro("la biblia","yisus", ed1);
        System.out.println(l2);
        System.out.println(ed1);
        System.out.println(Libro.getLibrosDisponibles());
        System.out.println();

        Prestamo p1 = l1.prestar(e2);
        System.out.println(p1);
        System.out.println();

        System.out.println(e2);
        System.out.println();

        System.out.println(l1);
        System.out.println(Libro.getLibrosDisponibles());
        System.out.println();

        l1.devolver(e2);
        System.out.println(l1);
        System.out.println(e2);
        System.out.println(Libro.getLibrosDisponibles());
        l1.devolver(e2);

        System.out.println();
        l1.estaDisponible();

    }
}
