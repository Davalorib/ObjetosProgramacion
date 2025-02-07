package T4Programacion.Practica3;

import T4Programacion.Practica1.Empleado;
import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Instituto {

    private final String NOMBRE;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    public Instituto(String NOMBRE){
        if (NOMBRE==null) {
            this.NOMBRE = "Instituto sin nombre";
        } else {
            this.NOMBRE = NOMBRE;
        }
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if (curso == null){
            System.out.println("No se puede agregar un curso nulo");
            return;
        }
        for (Curso c:listaCursos){
            if (listaCursos.contains(curso)){
                return;
            }
        }
        listaCursos.add(curso);
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (estudiante == null){
            System.out.println("No se puede agregar un estudiante nulo");
            return;
        }
        listaEstudiantes.add(estudiante);
    }


}
