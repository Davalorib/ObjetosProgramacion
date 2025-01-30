package T4Programacion;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String EMAILBASE = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String name;
    private String curso;
    private int nia;
    private String email;
    private Libro libroPrestado;

    public Estudiante(String name,String curso,String email){

        this.name=name;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        libroPrestado=null;
    }

    public Estudiante(String name){
        this.name=name;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
    }

    public static int total(){
        return contadorEstudiantes;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNia() {
        return nia;
    }

    public String getCurso() {
        return curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString(){
        if(libroPrestado!=null){
            return "Estudiante: ["+getName()+" //"+getCurso()+" //"+getEmail()+" //"+getNia()+" //"+libroPrestado.getTitulo()+"]";
        }else{
            return "Estudiante: ["+getName()+" //"+getCurso()+" //"+getEmail()+" //"+getNia()+"]";
        }
    }

    public static boolean validar(String email){

        if(email.matches(EMAILBASE)) return true;
        return false;

    }

}
