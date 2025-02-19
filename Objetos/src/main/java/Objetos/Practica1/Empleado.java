package Objetos.Practica1;

public class Empleado {

    public static int cantidadID = 0; //un contador de cantidad de IDs que es publico para poder acceder a él si es necesario
    public static final String ID_DEF = "EP"; //una constante pública también para ir definiendo los IDs
    public static final String[] CARGOS = {"director","técnico","presentador","colaborador"}; //un array constante de los cargos
    public static final String CARGO_DEF = "pte"; //una constante del cargo predeterminado

    private String id; //la id del empleado
    private String nombre; //el nombre del empleado
    private String cargo; //el cargo del empleado
    private Empleado director; //objeto empleado que nos guarda el director
    private boolean hola; //un booleano para lo del cargo

    //un constructor de empleado al cual solo le pasamos un nombre, este es para definir el director del programa (dando por hecho que solamente hay 1 director del programa)
    public Empleado(String nombre){
        this(nombre, "director", null);
    }
    //

    //un constructor de empleado para los demás empleados (también pueden ser director pero serán de otra cosa, no del programa en sí, igual de sonido y tal)
    public Empleado(String nombre, String cargo, Empleado director){
        this.nombre=nombre; //lo metemos en nombre
        setCargo(cargo); //llamamos a setCargo ya que hay restricciones
        setDirector(director); //llamamos a setDirector ya que hay restricciones
        cantidadID++; //sumamos uno al contador de IDs
        this.id=calcularID(); //guardamos en la ID lo que nos devuelva el metodo calcularID
    }
    //

    //para calcular la ID
    private String calcularID() {
        return ID_DEF + String.format("%03d",cantidadID); //devuelve lo que contenga la constante de ID_DEF + el número del contador, lo rellena con ceros si no llega a 3 dígitos
    }
    //

    //el set del cargo que controla que sea uno de los que tiene el string de cargos
    public void setCargo(String cargo) {
        hola = true; //ponemos el booleano en true
        //un for que recorre el vector de cargos
        for (String ca : CARGOS) {
            if (ca.equals(cargo)) { //si el cargo es uno de los permitidos
                hola = false; //pone el booleano en false
                this.cargo = cargo; //añade el cargo
                break; //se sale del for
            }
        }
        //
        if (hola) { //si el booleano es true significa que no es uno de los cargos permitidos
            this.cargo = CARGO_DEF; //ponemos en cargo lo que contenga la constante CARGO_DEF
        }
    }
    //

    //el set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //

    //el get del nombre
    public String getNombre() {
        return nombre;
    }
    //

    //el get del cargo
    public String getCargo() {
        return cargo;
    }
    //

    //el set del director que controla que si el cargo es director, no tenga director
    public void setDirector(Empleado director) {
        if (this.cargo.equals("director")) { //si el cargo es director
            this.director=null; //ponemos el director en null
        } else { //sino le ponemos el que venga
            this.director=director;
        }
    }
    //

    //el get del director
    public Empleado getDirector() {
        return director;
    }
    //

    //el toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
