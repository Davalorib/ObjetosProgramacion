package Herencia.Abstract;

public class Fuego extends Pokemon{

    public Fuego(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("V de fuego");
    }
}
