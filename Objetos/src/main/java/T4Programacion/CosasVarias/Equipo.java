package T4Programacion.CosasVarias;

import java.util.ArrayList;

public class Equipo {

    private String name;
    private ArrayList<Persona> integrantes;

    public Equipo(String name) {
        this.name = name;
        integrantes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public void meterPersona(Persona persona) {
        integrantes.add(persona);
    }

    public void quitarPersona(Persona persona) {
        integrantes.remove(persona);
    }

    @Override
    public String toString() {
        return "Equipo: [nombre:"+getName()+", listaIntegrantes:"+getIntegrantes()+"]";
    }


}
