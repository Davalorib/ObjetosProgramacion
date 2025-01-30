package T4Programacion;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante est;
    private Libro libro;
    private LocalDate hoy;

    public Prestamo (Estudiante est, Libro libro) {
        this.est=est;
        this.libro=libro;
        hoy = LocalDate.now();
    }

    public LocalDate getHoy() {
        return hoy;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return est;
    }

    public void setEstudiante(Estudiante est) {
        this.est = est;
    }

    @Override
    public String toString() {
        return "Prestamo: ["+getEstudiante()+" "+getLibro()+" "+getHoy()+"]";
    }
}
