package Objetos.Practica3;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Estudiante { //el objeto curso creado toodo con Lombok

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
