package Objetos.Casa;

public class Propietario {

    private String nombre;
    private int edad;

    public Propietario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad=edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
