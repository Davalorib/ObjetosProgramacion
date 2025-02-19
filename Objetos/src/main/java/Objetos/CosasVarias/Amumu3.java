package Objetos.CosasVarias;

public class Amumu3 {
    public static void main(String[] args) {

        Persona p1 = new Persona("Javier", "Jimenez", "12345678R", 'M', 20, "Alicante", "Fontanero");
        Equipo e1 = new Equipo("Barsa");
        System.out.println(p1);
        System.out.println(e1);
        e1.meterPersona(p1);
        System.out.println();
        System.out.println(e1);
        Persona p2 = new Persona("Kikito", "11", "12345678R", 'H', 19, "Mutxamel", "ActorX");
        e1.meterPersona(p2);
        System.out.println(e1);
        e1.quitarPersona(p1);
        System.out.println();
        System.out.println(e1);

    }

}
