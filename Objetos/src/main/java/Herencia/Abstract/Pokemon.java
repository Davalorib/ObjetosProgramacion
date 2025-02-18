package Herencia.Abstract;

public abstract class Pokemon {

    private int nivel;

    public Pokemon(int nivel) {
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void mostrarNivel(){
        System.out.println("El nivel es "+nivel);
    }

}
