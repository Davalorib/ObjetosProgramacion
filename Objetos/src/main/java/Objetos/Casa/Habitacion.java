package Objetos.Casa;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros2;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion(String nombre, double metros2) {
        this.nombre = nombre;
        this.metros2=metros2;
        listaElectrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }

    public double getMetros2() {
        return metros2;
    }

    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    public void agregarElectrodomestico(String nombre, double consumo){
        if (!existeElectrodomestico(nombre)){
            Electrodomestico electrodomestico = new Electrodomestico(nombre,consumo);
            listaElectrodomesticos.add(electrodomestico);
        }

    }

    public boolean existeElectrodomestico(String nombre){

        for (Electrodomestico elec : listaElectrodomesticos){
            if(elec.getNombre().equals(nombre)){
                System.out.println("El electrodoméstico " + nombre + " ya existe");
                return true;
            }
        }

        return false;
    }

    public void mostrarElectrodomesticos(){
        System.out.println(listaElectrodomesticos);
    }

    public double calcularConsumoHabitacion(){

        double consumo = 0;

        for (Electrodomestico elec : listaElectrodomesticos){
            consumo+=elec.getConsumo();
        }

        return consumo;

    }

    @Override
    public String toString() {
        return "Habitación: [nombre:"+getNombre()+", metros"+metros2+ " electrodomésticos=" + listaElectrodomesticos + " ]";
    }

}
