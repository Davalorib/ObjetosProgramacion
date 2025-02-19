package Objetos.Repaso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Cuenta {

    private static int CONTADORIBAN = 0;
    private static final String IBAN = "ES";

    private String iban;
    private double saldo;
    private ArrayList<Cuenta> listaCuenta;
    private String titular;

    public Cuenta(String titular) {
        CONTADORIBAN++;
        this.saldo = 0.0;
        this.iban = calcularIban();
        agregarCuenta(this);
    }

    private String calcularIban(){
        return IBAN + String.format("%X3d", CONTADORIBAN);
    }

    public void agregarCuenta(Cuenta cuenta){
        if(listaCuenta.contains(cuenta)){
            System.out.println("La cuenta ya está en la base");
        }
        listaCuenta.add(cuenta);
        System.out.println("Has registrado la cuenta");
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", listaCuenta=" + listaCuenta +
                ", titular='" + titular + '\'' +
                '}';
    }
}
