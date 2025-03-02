package Herencia.Practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println(getNombre()+" está dándole un masajito a "+jugador.getNombre());
    }


}
