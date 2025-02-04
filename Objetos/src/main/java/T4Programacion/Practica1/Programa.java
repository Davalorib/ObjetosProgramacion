package T4Programacion.Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    Scanner ent = new Scanner(System.in);

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String dire){
        this.nombre = nombre;
        this.cadena = cadena;
        this.director = director;
    }

    public void agregarEmpleado(String nombre, String cargo) {

        for (Empleado e:listaEmpleados){
            if (e.getNombre().equals(nombre)){
                System.out.println("El empleado "+nombre+" ya existe");
                return;
            }
        }
        Empleado empleado = new Empleado(nombre);
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

//    public void agregarInvitado(String nombre, String profesion) {
//        Invitado invitado = new Invitado(nombre,profesion);
//        listaInvitados.add(invitado);
//    }

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

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", director=" + director +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                '}';
    }
}
