package Herencia.EmpleadosySusTareas;

public class Main {

    public static void main(String[] args) {

        Empleados[] empleados = {
                new Desarrollador(),
                new Disenyador(),
                new Gerente()
        };

        for (Empleados e:empleados) {
            e.realizarTarea();
        }

        System.out.println();
        Empleados gerente = new Gerente();
        asignarTarea(gerente);

        Empleados desarrollador = new Desarrollador();
        asignarTarea(desarrollador);

    }

    public static void asignarTarea(Empleados empleados){

        System.out.println("Asignando tarea al empleado...");
        empleados.realizarTarea();
    }

}
