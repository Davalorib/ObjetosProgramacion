package Herencia.RedesSociales;

public class Usuario {

    protected String nombre;
    protected int edad;
    protected String nombreUsuario;
    protected int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nNombre de usuario: @"+nombreUsuario+" Seguidores: "+seguidores);
    }

}
