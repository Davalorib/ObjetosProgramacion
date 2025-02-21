package Excepciones.Cajero;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class CuentaBancaria {

    Scanner ent = new Scanner(System.in);

    private int saldo;

    public CuentaBancaria(){
        this.saldo = 0;
    }

    public void ingresar(){
        System.out.println("Introduce la cantidad a ingresar: ");
        this.saldo += ent.nextInt();
    }

    public void retirar(){
        System.out.println("Introduce la cantidad a retirar: ");
        int blabla = ent.nextInt();
        if (saldo<blabla) System.out.println("Eres pobre");
        else this.saldo -= blabla;
    }

}
