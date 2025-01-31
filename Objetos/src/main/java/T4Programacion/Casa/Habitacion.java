package T4Programacion.Casa;

public class Habitacion {

    private String nombre;
    private double metros2;

    public Habitacion(String nombre, double metros2) {
        this.nombre = nombre;
        this.metros2=metros2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }

    public double getMetros2() {
        return metros2;
    }

    @Override
    public String toString() {
        return "Habitación: [nombre:"+getNombre()+", metros"+metros2+"]";
    }

}
