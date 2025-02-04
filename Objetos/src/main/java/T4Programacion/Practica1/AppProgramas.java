package T4Programacion.Practica1;

public class AppProgramas {
    public static void main(String[] args) {


        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        //
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

//        //insertamos empleados en el programa
//        el_hormiguero.agregarEmpleado("Pablo Motos","presentador",null);
//        System.out.println(el_hormiguero);
//
//        //ver empleados del programa
//        System.out.println(el_hormiguero.getListaEmpleados());
//
//        //insertamos invitados en el programa
//        el_hormiguero.agregarInvitado("Aitana","cantante",1);
//
//        //ver invitados del programa
//        System.out.println(el_hormiguero.getListaInvitados());
    }
}
