package Herencia.RedesSociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public void meterColaboradores(String... colaboradores){
        this.colaboraciones.addAll(Arrays.asList(colaboradores));
    }

    public void mostrarInfo(){
        System.out.println("Información del Influencer:");
        super.mostrarInfo();
        System.out.println(colaboraciones);
    }

}
