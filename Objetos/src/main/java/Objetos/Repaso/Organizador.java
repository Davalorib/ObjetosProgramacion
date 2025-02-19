package Objetos.Repaso;

import java.util.ArrayList;

public class Organizador {

    public static final String NOMBRE = "IES MUTXAMEL";
    public static final int MAX = 700;

    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador(String edicion){
        listaCorredores = new ArrayList<>(MAX);
        this.edicion = edicion;
    }

    public void inscribir_corredor(Corredor corredor){
        if (!listaCorredores.contains(corredor)) {
            System.out.println("* Nueva inscripción realizada. Corredor: "+corredor.infoCorredor());
            listaCorredores.add(corredor);
        } else {
            System.out.println("Ese corredor ya fue inscrito");
        }
    }

    public void mostrarCorredores(){
        System.out.println("Corredores inscritos: "+listaCorredores.size());
        for (Corredor c:listaCorredores){
            System.out.println("["+c.getDorsal()+"]. "+c.getNombre());
        }
    }

    public void calcularDonacion(Corredor corredor){
        System.out.println("El corredor "+corredor.getNombre()+" ha conseguido una donación de " +corredor.getVueltas_completadas()*corredor.getImporte_vuelta()+"€");
    }

    @Override
    public String toString() {
        return "- Organizador [" +
                "nombre='" + NOMBRE + '\'' +
                ", edicion='" + edicion + '\'' +
                ", listaCorredores=" + listaCorredores +
                ']';
    }
}
