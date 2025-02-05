package T4Programacion.Practica1;
import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private int temporada;
    private LocalDate fecha_visita;

    public Invitado (String nombre, String profesion, int temporada) {
        this.nombre=nombre;
        this.profesion=profesion;
        this.temporada=temporada;
        this.fecha_visita = LocalDate.now();
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
