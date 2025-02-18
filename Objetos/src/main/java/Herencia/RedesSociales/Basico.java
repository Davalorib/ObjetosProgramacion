package Herencia.RedesSociales;

public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
    }

    public void mostrarInfo(){
        System.out.println("Información de la Persona Normal:");
        super.mostrarInfo();
    }
}
