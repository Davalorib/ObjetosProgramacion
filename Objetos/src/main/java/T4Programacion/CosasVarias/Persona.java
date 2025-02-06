package T4Programacion.CosasVarias;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private char secso;
    private int edad;
    private String ciudad;
    private String profesion;


    public Persona(){
    }

    public Persona(String nombre, String apellido, String dni, char secso, int edad, String ciudad, String profesion){

        this.nombre=nombre;
        setApellido(apellido);
        this.dni=dni;
        this.secso=secso;
        this.edad=edad;
        this.ciudad=ciudad;
        this.profesion=profesion;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        if (!apellido.equalsIgnoreCase("messi")){
            this.apellido=apellido;
        }
    }

    public String getDni(){
        return this.dni;
    }

    public void getDni(String dni){
        this.dni=dni;
    }

    public char getSecso(){
        return this.secso;
    }

    public void setSecso(char secso){
        this.secso=secso;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public void setCiudad(){
        this.ciudad=ciudad;
    }

    public String getProfesion(){
        return this.ciudad;
    }

    public void setProfesion(){
        this.profesion=profesion;
    }

    public String concatenar(){
        return this.nombre + " " + this.apellido;
    }

    public void info(){

        System.out.println(this.nombre +" "+ this.apellido +" "+ this.dni +" "+ this.secso +" "+ this.edad);

    }

    @Override
    public String toString(){
        return "Persona : [ nombre="+nombre+", apellido="+apellido+", dni="+dni+", secso="+secso+", edad="+edad+", ciudad="+ciudad+", profesion="+profesion+" ]";
    }



}
