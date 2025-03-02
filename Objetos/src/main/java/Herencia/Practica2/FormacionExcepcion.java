package Herencia.Practica2;

public class FormacionExcepcion extends RuntimeException {

    public FormacionExcepcion() {
        super("No inventes, usa el formato correcto [N-N-N]");
    }

}
