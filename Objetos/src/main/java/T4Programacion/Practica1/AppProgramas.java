package T4Programacion.Practica1;

public class AppProgramas {
    public static void main(String[] args) {

        System.out.println();
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println();
        //
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        antena3.agregarPrograma(el_hormiguero);
        System.out.println(el_hormiguero);
        System.out.println();
        System.out.println(antena3);
        System.out.println();
        //
        el_hormiguero.agregarEmpleado("Pablo Motos","presentador",null);
        el_hormiguero.agregarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        System.out.println();
        //
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println();
        //
        el_hormiguero.agregarInvitado("Aitana","cantante",1);
        el_hormiguero.agregarInvitado("Aitana","cantante",2);
        el_hormiguero.agregarInvitado("Aitana","cantante",3);
        el_hormiguero.agregarInvitado("Juan","cantante",4);
        //
        System.out.println(el_hormiguero.getListaInvitados());
        System.out.println();
        System.out.println(el_hormiguero);
        System.out.println();
        el_hormiguero.invitadosTemporada(1);
        el_hormiguero.vecesInvitado("Aitana");
        System.out.println();
        el_hormiguero.invitadosTemporada(0);
        el_hormiguero.vecesInvitado("Juan");
        System.out.println();
        el_hormiguero.rastrearInvitado("Aitana");
        System.out.println();
        el_hormiguero.invitadoAntes("Aitana");
    }
}
