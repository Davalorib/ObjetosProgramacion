package T4Programacion.CosasVarias;

import java.util.Scanner;

public class Amumu {

    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Nombre:");
//        String name = ent.next();
//        System.out.println("Edad:");
//        int edad = ent.nextInt();
//        System.out.println("Genero:");
//        char gen = ent.next().charAt(0);
//        System.out.println("Peso:");
//        double peso = ent.nextDouble();
//        System.out.println("Altura:");
//        double altura = ent.nextDouble();
//
        Paciente p1 = new Paciente();
//        Paciente p2 = new Paciente(name, edad, gen);
//        Paciente p3 = new Paciente(name, edad, gen, peso, altura);
//        p1.setNombre("pikachu");
//        p1.setEdad(22);
//        p1.setSecso('K');
//        p1.setPeso(72.5);
//        p1.setAltura(1.77);
//        System.out.println();
//        p1.info();
//        p2.info();
//        p3.info();
//
//        System.out.println();
//        gordito(p1);
//        gordito(p2);
//        gordito(p3);
//
//        System.out.println();
//        siono(p1);
//        siono(p2);
//        siono(p3);

    }

    public static void gordito(Paciente miniom){

        int num = miniom.imc();

        switch (num){
            case Paciente.LARRY:
                System.out.println(miniom.getNombre()+" es literalmente Larry");
                break;
            case Paciente.NORMAL:
                System.out.println(miniom.getNombre()+" está en su prime");
                break;
            case Paciente.IBAI:
                System.out.println(miniom.getNombre()+" pesa más que el warzone");
                break;
        }
    }

    public static void siono(Paciente miniom){

        if (miniom.OG()){
            System.out.println(miniom.getNombre() +" es legal");
        } else {
            System.out.println(miniom.getNombre() +" aún tiene los dientes de leche");
        }

    }

}
