package Herencia.Abstract;

public class Agua extends Pokemon{

    public Agua(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("Cascada");
    }

}