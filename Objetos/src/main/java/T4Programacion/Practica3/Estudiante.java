package T4Programacion.Practica3;


import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
