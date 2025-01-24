package T4Programacion;

public class Libro {

    public static int cantidadLibros;
    public static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    public Libro(String titulo, String autor, String id){

    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }






}
