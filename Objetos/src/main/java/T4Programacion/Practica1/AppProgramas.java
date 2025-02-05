package T4Programacion.Practica1;

public class AppProgramas {
    public static void main(String[] args) {

        System.out.println();
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println();
        //
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);
        System.out.println();
        System.out.println(antena3);
        System.out.println();
        //
        el_hormiguero.agregarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        System.out.println();
        //
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println();
        //
        el_hormiguero.agregarInvitado("Aitana","cantante",1);
        //
        System.out.println(el_hormiguero.getListaInvitados());
        System.out.println();
        System.out.println(el_hormiguero);
    }
}
