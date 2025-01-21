package T4Programacion;

public class Televisor {

    private int canal;

    public Televisor() {
    }

    public Televisor(int canal){

        setCanal(canal);

    }

    public int subirCanal(){
        return this.canal+1;
    }

    public int bajarCanal(){
        return this.canal-1;
    }
    
    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}
