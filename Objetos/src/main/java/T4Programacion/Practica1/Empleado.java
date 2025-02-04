package T4Programacion.Practica1;

public class Empleado {

    public static int cantidadID = 0;
    public static final String ID_DEF = "EP";

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre){
        this.nombre=nombre;
        cargo="director";
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
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
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
