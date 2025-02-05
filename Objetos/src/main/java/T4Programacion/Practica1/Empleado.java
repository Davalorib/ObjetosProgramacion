package T4Programacion.Practica1;

public class Empleado {

    public static int cantidadID = 0;
    public static final String ID_DEF = "EP";

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre){
        this(nombre, "director", null);
    }

    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre=nombre;
        setCargo(cargo);
        setDirector(director);
        cantidadID++;
        this.id=calcularID();
    }

    private String calcularID() {
        return ID_DEF + String.format("%03d",cantidadID);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setDirector(Empleado director) {
        if (this.cargo.equals("director")) {
            this.director=null;
        } else {
            this.director=director;
        }
    }

    public Empleado getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
