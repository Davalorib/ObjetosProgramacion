package Herencia.enum_asignaturas;

public enum Asignaturas {

    PROGRAMACION(256),IPE(96),SISTEMAS(160),PROYECTO(32),BASES(224),LENGUAJES(96),ENTORNOS(96);

    private int horas;

    Asignaturas(int horas){
        this.horas=horas;
    }

    public int getHoras() {
        return horas;
    }
}
