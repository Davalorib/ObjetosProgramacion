package Objetos.Biblioteca;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String EMAILBASE = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String name;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String name,String curso,String email){

        this.name=name;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String name){
        this.name=name;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
    }

    public static int total(){
        return contadorEstudiantes;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNia() {
        return nia;
    }

    public String getCurso() {
        return curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void meterLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void quitarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString(){
        //if(!librosPrestados.isEmpty()){
            return "Estudiante: ["+getName()+" //"+getCurso()+" //"+getEmail()+" //"+getNia()+librosPrestados+"]";
        //}else{
        //    return "Estudiante: ["+getName()+" //"+getCurso()+" //"+getEmail()+" //"+getNia()+"]";
        //}
    }

    public static boolean validar(String email){

        if(email.matches(EMAILBASE)) return true;
        return false;

    }

}
