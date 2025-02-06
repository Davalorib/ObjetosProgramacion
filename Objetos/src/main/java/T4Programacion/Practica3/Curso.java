package T4Programacion.Practica3;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}
