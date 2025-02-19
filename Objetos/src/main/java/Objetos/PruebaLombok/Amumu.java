package Objetos.PruebaLombok;

public class Amumu {
    public static void main(String[] args) {

        try {
            Instituto a = new Instituto(null, "ALC");
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("Nanai tolai");
        }

        Instituto b = new Instituto("Alluser", "Mutxamel", "Direccion calle falsa");
        System.out.println(b);


    }
}
