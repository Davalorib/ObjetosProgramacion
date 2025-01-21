package T4Programacion;



public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco","meSSi","12345678A",'H',45);

        persona1.info();
        persona2.info();

        System.out.println("\n"+persona2.concatenar());

        System.out.println("\nLa edad de "+persona2.getNombre()+" es "+persona2.getEdad());
        persona1.setApellido("Sin nombre");
        System.out.println(persona1.getApellido());
        persona1.setApellido("Messi");
        System.out.println(persona1.getApellido());
    }
}