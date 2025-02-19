package Objetos.Repaso;

import java.util.ArrayList;

public class Corredor {

    public static int CONT = 0;

    private String nombre;
    private int dorsal = 0;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int vueltas_completadas;
    private boolean llave;


    public Corredor(String nombre){
        listaPatrocinadores = new ArrayList<>();
        this.vueltas_completadas = 0;
        this.importe_vuelta = 0.50;
        this.nombre=nombre;
        this.dorsal=generarDorsal();
    }

    public Corredor(String nombre, double importe_vuelta){
        listaPatrocinadores = new ArrayList<>();
        this.vueltas_completadas = 0;
        this.importe_vuelta = importe_vuelta;
        this.nombre=nombre;
        this.dorsal=generarDorsal();
    }

    public int generarDorsal(){
        CONT++;
        this.dorsal=CONT;
        return dorsal;
    }

    public void insertarPatrocinador(String... nombre){
        llave = false;
        for (String n : nombre) {
            if (!listaPatrocinadores.contains(n)) {
                listaPatrocinadores.add(n);
                llave = true;
            } else {
                System.out.println("El patrocinador "+n+" ya estaba añadido");
            }
        }
        if (llave) {
            System.out.println("* Nuevos patrocinadores añadidos para el corredor " + infoCorredor());
        }
    }

    public String infoCorredor(){
        return getNombre()+" con dorsal "+getDorsal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

    @Override
    public String toString() {
        return "- Corredor [" +
                "Nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", listaPatrocinadores=" + listaPatrocinadores +
                ", importe_vuelta=" + importe_vuelta +
                ", vueltas_completadas=" + vueltas_completadas +
                ']';
    }
}
