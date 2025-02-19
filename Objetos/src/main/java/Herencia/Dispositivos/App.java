package Herencia.Dispositivos;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new Alexa("Manuela"));
        listaDispositivos.add(new AireAcondicionado("Nikelodeon"));
        listaDispositivos.add(new Televisor("Samsung"));

        for (Dispositivo dispositivo:listaDispositivos){
            System.out.println("--------------------------");
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) ((ControlRemoto) dispositivo).sincronizar();
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }

    }

}
