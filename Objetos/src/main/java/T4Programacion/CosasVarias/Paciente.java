package T4Programacion.CosasVarias;

import java.util.Random;

public class Paciente {

    public static final char SECSO_DEFAULT = 'X';
    public static final int LARRY = -1;
    public static final int IBAI = 1;
    public static final int NORMAL = 0;
    public static final int LEGAL = 18;

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

    public Paciente(String nombre, int edad, char secso){
        this(nombre, edad, secso, 0.0,0.0);
    }

    public Paciente(String nombre, int edad, char secso, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        setSecso(secso);
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

    public int imc(){

        double res = peso/Math.pow(altura,2);
        if (res<20) {
            return LARRY;
        } else if (res>25) {
            return IBAI;
        } else {
            return NORMAL;
        }
    }

    public boolean OG(){
        if (edad>=LEGAL){
            return true;
        } else {
            return false;
        }
    }

    public void enfermo(char setso){
        if (setso == 'H' || setso == 'M'){
            this.secso=setso;
        } else {
            this.secso=SECSO_DEFAULT;
        }
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

    public String getDni(){
        return this.dni;
    }

    public char getSecso() {
        return this.secso;
    }

    public void setSecso(char secso) {
        enfermo(secso);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Paciente : [ nombre="+nombre+", edad="+edad+", genero="+secso+", peso="+peso+", altura="+altura+" ]";
    }


}