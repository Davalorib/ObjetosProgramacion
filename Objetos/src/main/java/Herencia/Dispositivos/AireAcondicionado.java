package Herencia.Dispositivos;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    public void encender() {
        if (isEstado()) System.out.println("El aire acondicionado ya está encendido");
        else {
            System.out.println("Encendiendo aire acondicionado...");
            setEstado(true);
        }
    }
}
