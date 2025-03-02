package Herencia.Practica2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class MutxamelFC implements FuncionesIntegrantes{

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre+" se concentra tanto que evoluciona");
    }

    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad);
    }

    public void celebrarGol() {
        System.out.println("GOLASOO");
    }

}
