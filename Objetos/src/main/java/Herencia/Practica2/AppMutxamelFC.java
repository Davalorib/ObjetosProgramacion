package Herencia.Practica2;

import java.util.ArrayList;

public class AppMutxamelFC {

    public static void main(String[] args) {

        // crear varios jugadores para el equipo SENIOR
        Jugador Roberto = new Jugador("Roberto", 28, 69, Equipos.SENIOR, Posiciones.DELANTERO);
        Jugador Mauro = new Jugador("Mauro", 92, 13, Equipos.SENIOR, Posiciones.PORTERO);
        Jugador Denys = new Jugador("Denys", 25, 5, Equipos.SENIOR, Posiciones.DEFENSA);

        // crear al entrenador del equipo SENIOR
        Entrenador Izan = new Entrenador("Izan", 20, Equipos.SENIOR, "4-3-3");

        // crear a los masajistas del club
        Masajista AntonioCalvo = new Masajista("Antonio", 230, "Masajista", 702);
        Masajista DavidElMalo = new Masajista("DavidElMalo", 9, "Ninguna", 0);

        // crear a algún acompañante para un par de jugadores
        Acompanyante Cesar = new Acompanyante("Cesar", 25, Roberto, "Amigo");
        Acompanyante AntonioElOtro = new Acompanyante("Antonio", 27, Denys, "Cocido");

        AppMantenimiento.menuApp();
        System.out.println();
        System.out.println(Mauro.getCategoria());
        System.out.println();

        //creo una lista de MutxamelFC para realizar todas las acciones con los instanceof
        ArrayList<MutxamelFC> si = new ArrayList<>();
        si.add(Roberto);
        si.add(Mauro);
        si.add(Denys);
        si.add(Izan);
        si.add(AntonioCalvo);
        si.add(DavidElMalo);
        si.add(Cesar);
        si.add(AntonioElOtro);


        for (MutxamelFC m:si){
            m.concentrarse();
            if (m instanceof AccionesDeportivas) ((AccionesDeportivas) m).entrenar();
            if (m instanceof Masajista) ((Masajista) m).darMasaje(Roberto);
            m.viajar("Barcelona");
            if (m instanceof Entrenador) ((Entrenador) m).planificarEntrenamiento();
            if (m instanceof AccionesDeportivas) ((AccionesDeportivas) m).entrenar();
            if (m instanceof Jugador) {
                ((Jugador) m).descansar();
                ((Jugador) m).calentar();
            }
            if (m instanceof AccionesDeportivas) ((AccionesDeportivas) m).jugarPartido("Madrid");
            if (m instanceof Acompanyante) ((Acompanyante) m).animarEquipo();
            if (m instanceof Entrenador) ((Entrenador) m).hacerCambios();
            if (m instanceof Jugador) ((Jugador) m).marcarGol();
            m.celebrarGol();
            if (m instanceof Masajista){
                ((Masajista) m).darMasaje(Mauro);
                ((Masajista) m).darMasaje(Denys);
            }
            m.viajar("Mutxamel");
            if (m instanceof Jugador) ((Jugador) m).descansar();
            System.out.println();
        }



    }


}
