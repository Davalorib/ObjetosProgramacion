package Herencia.Abstract;

public class AppPokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(5);
        pikachu.atacar();
        pikachu.mostrarNivel();

        Fuego victini = new Fuego(69);
        victini.atacar();
        victini.mostrarNivel();

        Pokemon[] pokemons = {
                new Electrico(5),
                new Fuego(69),
                new Agua(100)
        };

        for (Pokemon p:pokemons){
            p.atacar();
        }

    }
}