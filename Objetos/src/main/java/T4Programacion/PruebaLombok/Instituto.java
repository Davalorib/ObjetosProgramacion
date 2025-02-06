package T4Programacion.PruebaLombok;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Data
@RequiredArgsConstructor
//@Getter @Setter
//@ToString
public class Instituto {

    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;


//    public void setNombre(@NonNull String nombre) {
//        this.nombre = nombre;
//    }

    //    public Instituto(String nombre){
//
//        this.nombre = Objects.requireNonNullElse(nombre,"IES");
//        if (nombre==null){
//            System.out.println("nanai tolai");
//        } else {
//            this.nombre=nombre;
//        }
//    }

}
