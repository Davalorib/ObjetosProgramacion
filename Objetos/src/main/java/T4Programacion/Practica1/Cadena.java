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

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void agregarPrograma(Programa programa) {
        if (!listaProgramas.contains(programa)) {
            listaProgramas.add(programa);
        }
    }

    public void quitarPrograma(Programa programa) {
        this.listaProgramas.remove(programa);
    }

    public void mostrarPrograma() {
        for(Programa p:listaProgramas) {
            System.out.println("- "+p.getNombre()+" (Director:"+p.getDirector().getNombre()+")");
        }
    }

    @Override
    public String toString() {
        return "Cadena [nombre='"+nombre+"', listaProgramas="+listaProgramas+"]";
    }
}
