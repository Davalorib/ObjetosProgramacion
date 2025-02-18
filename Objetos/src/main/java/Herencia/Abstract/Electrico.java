package Herencia.Abstract;

public class Electrico extends Pokemon{

    public Electrico(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("Rayo");
    }
}
