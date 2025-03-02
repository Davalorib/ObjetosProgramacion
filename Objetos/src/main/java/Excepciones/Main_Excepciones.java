package Excepciones;

public class Main_Excepciones {

    public static void main(String[] args) {
        int nivel = 150;

        if (nivel>100){
            throw new NvlMaxException("anormal");
        }
    }
}
