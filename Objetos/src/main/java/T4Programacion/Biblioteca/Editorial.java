package T4Programacion.Biblioteca;

import java.util.ArrayList;

public class Editorial {

    private String name;
    private String pais;
    private ArrayList<Libro> librosPublicados;

    public Editorial(String name, String pais) {
        this.name=name;
        this.pais=pais;
        librosPublicados = new ArrayList<>();
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(ArrayList<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }

    public void meterLibro(Libro libro) {
        librosPublicados.add(libro);
    }

    public void quitarLibro(Libro libro) {
        librosPublicados.remove(libro);
    }

    @Override
    public String toString(){
        return "Editorial: ["+getNombre()+ " //"+getPais()+" //"+librosPublicados+"]";
    }
}
