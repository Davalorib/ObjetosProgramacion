package Herencia.Practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Acompanyante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println(getNombre()+" está animando al equipo");
    }

}
