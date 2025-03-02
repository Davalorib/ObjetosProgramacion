package Herencia.Practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Scanner;

@Getter @Setter @ToString
public class Jugador extends MutxamelFC implements AccionesDeportivas{

    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, int dorsal, Equipos categoria, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        comprobarDorsal(dorsal);
        this.dorsal = dorsal;
        jugadores.add(this);
    }

    public void comprobarDorsal(int dorsal){
        for (Jugador j:jugadores){
            if (j.getCategoria() == this.categoria && j.getDorsal() == dorsal){
                throw new NumExcepcion();
            }
        }
    }

    public void calentar(){
        System.out.println(getNombre()+" está calentando muy duro");
    }

    public void descansar(){
        System.out.println(getNombre()+" está descansando");
    }

    public void marcarGol(){
        System.out.println("Vaya golazo ha marcado "+getNombre());
    }

    public void entrenar() {
        System.out.println(getNombre()+" está entrenando como animal");
    }

    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" está jugando contra "+rival);
    }

    public void setDorsal(int dorsal) {
        comprobarDorsal(dorsal);
        this.dorsal = dorsal;
    }

    public void setCategoria(Equipos categoria) {
        for (Jugador j:jugadores) {
            if (j.getCategoria() == categoria && j.getDorsal() == this.dorsal) {
                throw new NumExcepcion();
            }
        }
        this.categoria = categoria;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre()+", Edad: "+getEdad()+", Categoría: "+getCategoria()+", Dorsal: "+getDorsal()+", Posición: "+getPosicion()+"]");
    }

    public static void modificarJugador() {

        Scanner ent = new Scanner(System.in);

        System.out.println("\n¿De qué jugador quieres hacer cambios?");

        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            System.out.print("["+i+", ");
            jugador.mostrarInfo();
        }

        System.out.println("\n===========================================");
        System.out.print("\nSelecciona una opción --> ");

        int elec = ent.nextInt();

        Jugador jugadorElec = jugadores.get(elec);
        System.out.println("Modificando jugador: " + jugadorElec.getNombre());

        System.out.println("¿Qué quieres modificar? [nombre,edad,categoria,dorsal,posicion]: ");

        switch (ent.next().toLowerCase()) {
            case "nombre":
                System.out.print("Nuevo nombre --> ");
                String nombre = ent.next();
                jugadorElec.setNombre(nombre);
                break;
            case "edad":
                System.out.print("Nueva edad --> ");
                int edad = ent.nextInt();
                jugadorElec.setEdad(edad);
                break;
            case "categoria":
                System.out.print("Nueva categoria --> ");
                String categoria = ent.next().toUpperCase();
                try {
                    Equipos categoriaBien = Equipos.valueOf(categoria);
                    jugadorElec.setCategoria(categoriaBien);
                } catch (NumExcepcion e){
                    System.out.println("Tendrías que cambiar primero el dorsal");
                }
                break;
            case "dorsal":
                System.out.print("Nuevo dorsal --> ");
                int dorsal = ent.nextInt();
                try {
                    jugadorElec.setDorsal(dorsal);
                    System.out.println("Dorsal cambiado");
                } catch (NumExcepcion e) {
                    System.out.println("Ese está pillado");
                }
                break;
            case "posicion":
                System.out.print("Nueva posicion --> ");
                String posi = ent.next().toUpperCase();
                Posiciones posiBien = Posiciones.valueOf(posi);
                jugadorElec.setPosicion(posiBien);
                System.out.println("Posicion cambiada");
                break;
            default:
                System.out.println("Esa opción no existe");
                break;
        }
    }
}
