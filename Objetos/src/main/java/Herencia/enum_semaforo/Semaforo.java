package Herencia.enum_semaforo;

public enum Semaforo {

    AMARILLO,ROJO,VERDE;

    public Semaforo siguiente(Semaforo color){
        switch (color){
            case ROJO:
                return Semaforo.VERDE;
            case VERDE:
                return Semaforo.AMARILLO;
            case AMARILLO:
                return Semaforo.ROJO;
            default:
                return Semaforo.AMARILLO;
        }
    }

}
