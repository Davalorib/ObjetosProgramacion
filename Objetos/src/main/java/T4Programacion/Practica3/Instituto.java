package T4Programacion.Practica3;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Instituto {

    private final String NOMBRE;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    public void agregarCurso(Curso curso){
        if (curso == null){
            System.out.println("No se puede agregar un curso nulo");
            return;
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
