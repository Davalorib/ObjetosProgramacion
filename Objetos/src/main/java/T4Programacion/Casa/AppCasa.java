package T4Programacion.Casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio",50);
        casa.agregarHabitacion("Cocina",40);
        casa.agregarHabitacion("Baño",25);

        System.out.println();
        casa.mostrarHabitaciones();
        System.out.println("\nLa habitación pepina es "+casa.getHabitacionGrande().getNombre());
        casa.agregarHabitacion("Baño",25);
        casa.eliminarHab("Baño");
        System.out.println();
        casa.mostrarHabitaciones();

    }

}
