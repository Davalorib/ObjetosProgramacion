package T4Programacion;

public class Editorial {

    private String name;
    private String pais;

    public Editorial(String name, String pais) {
        this.name=name;
        this.pais=pais;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString(){
        return "Editorial: ["+getNombre()+ " //"+getPais()+"]";
    }
}
