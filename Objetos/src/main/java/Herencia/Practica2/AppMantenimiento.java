package Herencia.Practica2;

import java.util.Scanner;

public class AppMantenimiento {

    static Scanner ent = new Scanner(System.in);

    public static void menuApp() {
        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println("    [1]. Mantenimiento de jugadores");
        System.out.println("            Dentro podremos añadir jugadores, modificar datos y añadir acompañantes");
        System.out.println("    [2]. Mantenimiento de entrenadores");
        System.out.println("            Dentro podremos añadir entrenadores y modificar sus datos");
        System.out.println("    [3]. Mantenimiento masajistas");
        System.out.println("            Dentro podremos añadir masajistas y modificar sus datos");
        System.out.println("    [4]. Consultar equipos");
        System.out.println("            Dentro se deben listar los tipos de equipos del club y elegir uno");
        System.out.println("    [X]. Salir");
        System.out.println("\n===========================================");
        System.out.print("\nSelecciona una opción --> ");

        switch (ent.next()) {
            case "1":
                menuJugadores();
                break;
            case "2":
                System.out.println("Esto aún no va");
                break;
            case "3":
                System.out.println("Esto aún no va 2");
                break;
            case "4":
                System.out.println("Esto aún no va 3");
                break;
            case "X":
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Esa opción no existe");
        }
    }


    private static void menuJugadores() {

        System.out.println("\n=== Mantenimiento de Jugadores ===");
        System.out.println("    [1]. Añadir nuevo jugador");
        System.out.println("    [2]. Modificar datos de jugador existente");
        System.out.println("    [3]. Crear acompañantes (solo seniors)");
        System.out.println("    [X]. Volver al menú principal");
        System.out.println("\n===========================================");
        System.out.print("\nSelecciona una opción --> ");
        switch (ent.next()) {
            case "1":
                System.out.println("Esto no lo he metido");
                break;
            case "2":
                System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
                Jugador.modificarJugador();
                break;
            case "3":
                System.out.println("Esto no lo he metido 2");
                break;
            case "X":
                menuApp();
                break;
            default:
                System.out.println("Esa opción no existe");
        }

    }



}
