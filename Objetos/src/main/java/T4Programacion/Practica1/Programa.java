package T4Programacion.Practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String director){
        this.nombre = nombre;
        this.cadena = cadena;
        //
        this.director = new Empleado(director);
        //
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados.add(this.director);
        cadena.agregarPrograma(this);
    }

    public void agregarEmpleado(String nombre, String cargo, Empleado director) {
        for (Empleado e:listaEmpleados){
            if (e.getNombre().equals(nombre)){
                System.out.println("El empleado "+nombre+" ya existe");
                return;
            }
        }
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() {

        for(Empleado e:listaEmpleados) {
            System.out.println("- "+e.getNombre()+" ("+e.getCargo()+")");
        }
    }

    public void eliminarEmpleado(String nombre) {
        for (Empleado e:listaEmpleados){
            if (e.getNombre().equals(nombre)){
                listaEmpleados.remove(e);
                break;
            }
        }
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }

    public void mostrarInvitado() {

        for(Invitado i:listaInvitados) {
            System.out.println("- "+i.getNombre()+" ("+i.getProfesion()+")");
        }
    }

    public void eliminarInvitado(String nombre) {
        for (Invitado i:listaInvitados){
            if (i.getNombre().equals(nombre)){
                listaInvitados.remove(i);
                break;
            }
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", director=" + director +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                '}';
    }
}
