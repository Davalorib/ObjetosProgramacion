package T4Programacion;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;

    public Televisor() {
    }

    public Televisor(int canal, int volumen){
        setCanal(canal);
        setVolumen(volumen);
    }

    public int subirCanal(){
        return ++this.canal;
    }

    public int bajarCanal(){
        return --this.canal;
    }

    public int subirVolumen(){
        return ++this.volumen;
    }

    public int bajarVolumen(){
        return --this.volumen;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal) {
        if (canal>=1 && canal<=99) {
            this.canal = canal;
        }
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen>=0 && volumen<=100) {
            this.volumen = volumen;
        }
    }

}
