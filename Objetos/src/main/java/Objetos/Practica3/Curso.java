package Objetos.Practica3;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Curso { //el objeto curso creado toodo con Lombok

    @NonNull
    private String nombre;
    private int horas;

}
