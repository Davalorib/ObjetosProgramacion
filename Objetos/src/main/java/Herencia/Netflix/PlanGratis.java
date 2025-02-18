package Herencia.Netflix;

public class PlanGratis extends Suscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }
}
