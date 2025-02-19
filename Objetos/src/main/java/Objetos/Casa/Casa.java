package Objetos.Casa;
import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    Scanner ent = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion hab:habitaciones){
            if (hab.getNombre().equals(nombre)){
                System.out.println("La habitación "+nombre+" ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("La casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones");

        for(Habitacion hab:habitaciones) {
            System.out.println("- "+hab.getNombre()+" ("+hab.getMetros2()+"m²)");
        }
        System.out.println("Propietario: "+propietario.getNombre());
    }

    public Habitacion getHabitacionGrande() {
        Habitacion aux = habitaciones.get(0);
        for (Habitacion hab:habitaciones) {
            if(hab.getMetros2()>aux.getMetros2()){
                aux=hab;
            }
        }
        return aux;
    }

    public void setPropietario() {
        System.out.println("Introduce el propietario:");
        String name = ent.next();
        System.out.println("Edad del propietario");
        int edad = ent.nextInt();
        propietario = new Propietario(name,edad);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void eliminarHab(String nombre) {
        for (Habitacion hab:habitaciones){
            if (hab.getNombre().equals(nombre)){
                habitaciones.remove(hab);
                break;
            }
        }
    }

    public void calcularHabitacionMasConsumo(){

        double aux = 0;
        double aux_ant = 0;
        Habitacion mayor = habitaciones.get(0);

        for (Habitacion hab : habitaciones){
            aux = hab.calcularConsumoHabitacion();
            if(aux>aux_ant){
                mayor = hab;
            }
        }

        System.out.println("La habitación que más consume es: " +  mayor.getNombre() + " con " + mayor.calcularConsumoHabitacion() + "kWh");

    }

}