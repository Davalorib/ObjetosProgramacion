package T4Programacion.Practica1;

import java.util.ArrayList;

public class Cadena {

    private String nombre; //el nombre de la cadena
    private ArrayList<Programa> listaProgramas; //lista de objetos programa

    //el constructor de cadena
    public Cadena(String nombre) {
        this.nombre = nombre; //lo metemos en nombre
        this.listaProgramas = new ArrayList<>(); //inicializamos la lista de programas
    }
    //

    //el set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //

    //el get del nombre
    public String getNombre() {
        return nombre;
    }
    //

    //el get de la lista de programas
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }
    //

    //para agregar programas a la lista de programas
    public void agregarPrograma(Programa programa) {
        if (!listaProgramas.contains(programa)) { //si no lo contiene lo añade
            listaProgramas.add(programa);
        } else {
            System.out.println("Ya existe ese programa"); //si lo contiene te dice que ya está
        }
    }
    //

    //para quitar un programa de la lista de programas (no se usa pero está)
    public void quitarPrograma(Programa programa) {
        this.listaProgramas.remove(programa);
    }
    //

    //para mostrar los nombres y el director de la liasta de programas (no se usa pero meh)
    public void mostrarPrograma() {
        for(Programa p:listaProgramas) {
            System.out.println("- "+p.getNombre()+" (Director:"+p.getDirector().getNombre()+")");
        }
    }
    //

    //el toString
    @Override
    public String toString() {
        return "Cadena [nombre='"+nombre+"', listaProgramas="+listaProgramas+"]";
    }
}
