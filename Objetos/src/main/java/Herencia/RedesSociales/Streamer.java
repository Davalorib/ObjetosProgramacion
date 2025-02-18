package Herencia.RedesSociales;

public class Streamer extends Usuario {

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numero_retransmisiones=numero_retransmisiones;
        this.horas_directo=horas_directo;
    }

    public void mostrarInfo(){
        System.out.println("Información del Streamer:");
        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas: "+numero_retransmisiones+"\nHoras de directo:"+horas_directo);
    }
}
