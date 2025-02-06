package T4Programacion.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {

    private String nombre; //el nombre del programa
    private Cadena cadena; //objeto cadena
    private int temporadas; //el número para las temporadas
    private ArrayList<Empleado> listaEmpleados; //lista de objetos empleado
    private ArrayList<Invitado> listaInvitados; //lista de objetos invitado
    private Empleado director; //objeto empleado que nos guarda el director
    private int cont; //un contador para
    private LocalDate fecha1 = LocalDate.now(); //una fecha del dia de hoy para mas tarde compararla con fechas antiguas

    //el constructor de Programa
    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre; //lo metemos en nombre
        this.cadena = cadena; //lo metemos en cadena
        this.director = new Empleado(director); //como solo obtenemos el nombre, se lo pasamos a un constructor de Empleado que solo pide el nombre
        this.listaEmpleados = new ArrayList<>(); //inicializamos la lista de empleados
        this.listaInvitados = new ArrayList<>(); //inicializamos la lista de invitados
        this.listaEmpleados.add(this.director); //añadimos el director a la lista de empleados
        cadena.agregarPrograma(this); //agregamos este programa en la lista de programas del objeto cadena
    }
    //

    //para agregar un nuevo empleado a la lista de empleados
    public void agregarEmpleado(String nombre, String cargo, Empleado director) {
        //el for que se recorre la lista de empleados para asegurarse que no está repetido
        for (Empleado e:listaEmpleados){
            if (e.getNombre().equals(nombre)){ //si está repetido nos saca un mensaje por pantalla y no lo añade
                System.out.println("El empleado "+nombre+" ya existe");
                return;
            }
        }
        //
        //si el cargo de este empleado no es director, le añadimos el que viene con el
        if (!cargo.equals("director")) {
            director=this.director;
        }
        //
        Empleado empleado = new Empleado(nombre, cargo, director); //creamos el empleado y le pasamos estos datos
        listaEmpleados.add(empleado); //lo añadimos a la lista
    }

    //para mostrar los nombres y cargos de la lista de empleados (no se usa pero está)
    public void mostrarEmpleados() {
        for(Empleado e:listaEmpleados) {
            System.out.println("- "+e.getNombre()+" ("+e.getCargo()+")");
        }
    }
    //

    //para eliminar algun empleado (tampoco se usa pero ahí está)
    public void eliminarEmpleado(String nombre) {
        for (Empleado e:listaEmpleados){
            if (e.getNombre().equals(nombre)){
                listaEmpleados.remove(e);
                break;
            }
        }
    }
    //

    //para agregar invitados (sin el for porque este si se puede repetir)
    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada); //lo creamos y le pasamos estos datos
        listaInvitados.add(invitado); //lo añadimos a la lista
    }
    //

    //para mostrar los nombres y profesiones de los invitados (tampoco se usa pero también está por si acaso)
    public void mostrarInvitado() {
        for(Invitado i:listaInvitados) {
            System.out.println("- "+i.getNombre()+" ("+i.getProfesion()+")");
        }
    }
    //

    //para eliminar un invitado
    public void eliminarInvitado(String nombre) {
        for (Invitado i:listaInvitados){
            if (i.getNombre().equals(nombre)){
                listaInvitados.remove(i);
                break;
            }
        }
    }
    //

    //el get del director
    public Empleado getDirector() {
        return director;
    }
    //

    ////el set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //

    //el get del nombre
    public String getNombre() {
        return nombre;
    }
    //

    //el set de cadena
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }
    //

    //el get de cadena
    public Cadena getCadena() {
        return cadena;
    }
    //

    //el set de temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    //

    //el get de temporadas
    public int getTemporadas() {
        return temporadas;
    }
    //

    //el get de la lista de invitados
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    //

    //el get de lista de empleados
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    //

    //para ver los invitados de una temporada
    public void invitadosTemporada(int temp) {
        cont = 0; //reseteamos el contador
        System.out.println("Invitados de la temporada "+temp+":");
        //un for para recorrer la lista de invitados
        for (Invitado i:listaInvitados) {
            if (i.getTemporada() == temp) { //si la temporada de ese invitado coincide con la que buscamos saca por pantalla el nombre y profesion
                System.out.println("- "+i.getNombre()+" ("+i.getProfesion()+")");
                cont++; //suma 1 al contador
            }
        }
        //
        System.out.println("Invitados que han ido en la temporada "+temp+": "+cont); //muestra por pantalla la cantidad de invitados de esa temporada
    }
    //

    //para ver las veces que ha venido un invitado en específico
    public void vecesInvitado(String nombre) {
        cont = 0; //reseteamos el contador
        //un for para recorrer la lista de invitados
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equals(nombre)) { //si el nombre coincide sumamos 1 al contador
                cont++;
            }
        }
        //
        //saca por pantalla las veces que ha venido con una ternaria para que si es 1 nos salga "vez" en vez de "veces" pijotadas
        System.out.println("El invitado " + nombre + " ha ido la friolera cantidad de " + cont + " " + (cont == 1 ? "vez" : "veces"));
    }
    //

    //para ver las veces que ha venido un invitado en específico y sacar todas las fechas y temporadas de sus visitas
    public void rastrearInvitado(String nombre) {
        vecesInvitado(nombre); //reutilizamos el metodo anterior
        //un for para recorrer la lista de invitados
        for (Invitado i:listaInvitados) {
            if (i.getNombre().equals(nombre)) { //si el nombre coincide saca por pantalla la fecha de visita y la temporada
                System.out.println("- Fecha: "+i.getFecha_visita()+" (temporada "+i.getTemporada()+")");
            }
        }
        //
    }
    //

    //un booleano para buscar si ha ido un invitado
    public boolean buscarInvitado(String nombre) {
        //un for para recorrer la lista de invitados
        for (Invitado i:listaInvitados) {
            if (i.getNombre().equals(nombre)){ // si coincide el nombre es que está asi que devolvemos true
                return true;
            }
        }
        //
        return false; //sino devolvemos false
    }
    //

    //para ver cuando ha venido por primera vez un invitado en especifico a ese programa
    public void invitadoAntes(String nombre) {
        if (buscarInvitado(nombre)) { //si el booleano es true significa que está
            for (Invitado i:listaInvitados) { //un for que recorre la lista de invitados
                for (LocalDate fecha:i.getFechas()) { //esto es un invento la verdad, recorremos un arraylist de fechas creado en el objeto Invitado
                    if (fecha.isBefore(fecha1)) { //si la fecha de esa lista es menor que la que tenemos almacenada, nos guardamos esa fecha
                        fecha1=fecha;
                    }
                }
            }
            //imprime por pantalla el nombre y la fecha que nos hemos guardado anteriormente, ya que significa que es la más antigua
            System.out.println("La primera vez que "+nombre+" vino fue en "+fecha1);
        } else { //sino dice que no ha venido
            System.out.println(nombre+" no ha venido en su vida");
        }
    }
    //

    //el toString
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
