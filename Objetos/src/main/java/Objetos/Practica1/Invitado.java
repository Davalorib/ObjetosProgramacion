package Objetos.Practica1;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Invitado {

    Scanner ent = new Scanner(System.in); //el scanner

    private String nombre; //el nombre del invitado
    private String profesion; //la progesion del invitado
    private int temporada; //la temporada del invitado
    private LocalDate fecha_visita; //la fecha de la visita del invitado
    private String fecha; //un string fecha para el split
    private String[] fecha2; //un vector de fechas para guardar lo del split
    private int dia; //un int de dia para guardar el dia
    private int mes; //un int de mes para guardar el mes
    private int ano; //un int de año para guardar el año
    private boolean formato; //un booleano para controlar el formato de la fecha
    private ArrayList<LocalDate> fechas = new ArrayList<>(); //una lista de fechas para guardarlas y después comparar en Programa para sacar la más antigua

    //el constructor de Invitado
    public Invitado (String nombre, String profesion, int temporada) {
        this.nombre=nombre; //lo metemos en nombre
        this.profesion=profesion; //lo metemos en profesion
        this.temporada=temporada; //lo metemos en temporada
        setFecha_visita(); //llamamos al set de la fecha de la visita :D
    }
    //

    //el set de la fecha de la visita :D
    public void setFecha_visita() {
        System.out.println("Introduce la fecha de visita de "+getNombre()+ "(dd-mm-yyyy):"); //pedimos la fecha en ese formato
        fecha = ent.next();
        formato = fecha.matches("\\d{1,2}-\\d{1,2}-\\d{4}"); //controlamos el formato
        if (!formato) { //si el formato no es el correcto nos dice que no es válido y nos devuelve con el return
            System.err.println("> FORMATO NO VÁLIDO <");
            return;
        }
        fecha2 = fecha.split("-"); //spliteamos los guiones de la fecha
        dia = Integer.parseInt(fecha2[0]); //cogemos el dia
        mes = Integer.parseInt(fecha2[1]); //cogemos el mes
        ano = Integer.parseInt(fecha2[2]); //cogemos el año
        //un try para mirar si los datos de la fecha son correctos
        try {
            this.fecha_visita = LocalDate.of(ano, mes, dia); //si es correcto guardamos en la fecha el año, mes y dia
            this.fechas.add(this.fecha_visita); //lo añadimos a la lista de fechas
        } catch (DateTimeException e) { //su catch
            System.out.println("No inventes fechas"); //mostramos por pantalla que no se invente fechas
        }
        //
    }
    //

    //el get de la lista de fechas
    public ArrayList<LocalDate> getFechas() {
        return fechas;
    }
    //

    //el get de la fecha de visita
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }
    //

    //el set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //

    //el set de la profesion (no lo uso pero ahi esta)
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    //

    //el set de la temporada (tampoco lo uso pero lo pongo)
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    //

    //el get del nombre
    public String getNombre() {
        return nombre;
    }
    //

    //el get de la profesion
    public String getProfesion() {
        return profesion;
    }
    //

    //el get de la temporada
    public int getTemporada() {
        return temporada;
    }
    //

    //el toString
    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
