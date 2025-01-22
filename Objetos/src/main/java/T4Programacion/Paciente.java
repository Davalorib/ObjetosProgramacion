package T4Programacion;

import java.util.Random;

public class Paciente {

    public final static char SECSO_DEFAULT = 'X';

    private String nombre;
    private int edad;
    private String dni;
    private char secso;
    private double peso;
    private double altura;



    public Paciente(){
//        this.secso=SECSO_DEFAULT;
//        generarDni();
        this("",0,SECSO_DEFAULT,0.0,0.0);
    }

    public Paciente(String nombre, int edad, char secso, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.secso=secso;
        this.peso=peso;
        this.altura=altura;
        generarDni();
    }

    private void generarDni(){

        Random random = new Random();
        int numDni = random.nextInt(10000000, 99999999);
        int resto = numDni%23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        this.dni=Integer.toString(numDni) + letras[resto];
    }

    public void info(){

        System.out.println(this.nombre + " " + this.edad+ " " + this.secso+ " " + this.dni+ " " + this.peso + " " + this.altura);

    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSecso() {
        return this.secso;
    }

    public void setSecso(char secso) {
        this.secso = secso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}