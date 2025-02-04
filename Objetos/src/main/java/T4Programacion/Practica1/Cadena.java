package T4Programacion.Practica1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPrograma(String nombre, Cadena cadena, String director) {
        Programa programa = new Programa(nombre,cadena, director);
        listaProgramas.add(programa);
    }

//    public void mostrarPrograma() {
//
//        for(Programa p:listaProgramas) {
//            System.out.println("- "+p.getNombre()+" ("+e.getCargo()+")");
//        }
//    }
//
//    public void eliminarEmpleado(String nombre) {
//        for (Empleado e:listaEmpleados){
//            if (e.getNombre().equals(nombre)){
//                listaEmpleados.remove(e);
//                break;
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Cadena [nombre='"+nombre+"', listaProgramas="+listaProgramas+"]";
    }
}
