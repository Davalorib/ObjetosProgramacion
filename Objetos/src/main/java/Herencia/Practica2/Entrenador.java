package Herencia.Practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private static final String FORMACION = "\\d-\\d-\\d";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public void planificarEntrenamiento(){
        System.out.println(getNombre()+" está planificando el entrenamiento");
    }

    public void hacerCambios(){
        System.out.println(getNombre()+" está haciendo cambios");
    }

    public void entrenar() {
        System.out.println(getNombre()+" está entrenando a estos pacarros");
    }

    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" está jugando contra "+rival);
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (!formacionPreferida.matches(FORMACION)){
            throw new FormacionExcepcion();
        }
        this.formacionPreferida = formacionPreferida;
    }
}
