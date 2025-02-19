package Objetos.Practica3;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Instituto {

    private final String NOMBRE; //el nombre siendo constante para no cambiarse
    private String poblacion; //la poblacion
    private ArrayList<Estudiante> listaEstudiantes; //la lista de estudiantes
    private ArrayList<Curso> listaCursos; //la lista de cursos

    //el constructor de instituto, ya que tenemos que controlar el nombre
    public Instituto(String NOMBRE){
        if (NOMBRE==null) { //si el nombre es null le asignamos uno nosotros
            this.NOMBRE = "Instituto sin nombre";
        } else { //sino el que venga
            this.NOMBRE = NOMBRE; //hay que ponerlo aquí ya que al ser constante no hay setNOMBRE
        }
        listaEstudiantes = new ArrayList<>(); //inicializamos las listas
        listaCursos = new ArrayList<>();
    }

    //para agregar cursos a la lista de cursos
    public void agregarCurso(Curso curso){
        if (curso == null){ //si es nulo nos muestra un mensaje y no lo añade
            System.out.println("No se puede agregar un curso nulo");
            return;
        }
        for (Curso c:listaCursos){ //un for que recorre la lista de cursos y si el nombre y sus horas ya estaba no lo añade
            if (c.getNombre().equals(curso.getNombre()) && c.getHoras() == curso.getHoras()){
                System.out.println("Ese curso ya fue agregado");
                return;
            }
        }
        listaCursos.add(curso);
    }
    //

    //para agregar estudiantes a la lista de estudiantes
    public void agregarEstudiante(Estudiante estudiante){
        if (estudiante == null){ //si es nulo nos muestra un mensaje y no lo añade
            System.out.println("No se puede agregar un estudiante nulo");
            return;
        }
        listaEstudiantes.add(estudiante);
    }
    //

}
