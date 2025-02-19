package Objetos.Repaso;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class Cliente {

    Scanner entrada = new Scanner(System.in);
    private static int CONTADOR = 0;

    private int id;
    private String nombre;
    private String apellidos;
    private ArrayList<Cliente> listaCliente;
    private Cuenta cuenta;

    public Cliente(String nombre, String apellidos) {
        CONTADOR++;
        this.id = CONTADOR++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        agregarCliente(this);
    }

    public String pedirNombre(String nombre){
        System.out.println("Introduce el nombre: ");
        return entrada.next();
    }

    public String pedirApellido(String apellidos){
        System.out.println("Introduce apellido: ");
        return entrada.next();
    }

    public void agregarCliente(Cliente cliente){
        if(listaCliente.contains(cliente)){
            System.out.println("El cliente ya está en la base.");
        }
        listaCliente.add(cliente);
        System.out.println("Has registrado al cliente.");
    }

    public void eliminarCliente(String nombre, String apellidos){
        for(Cliente c : listaCliente){
            if(c.getNombre().equalsIgnoreCase(nombre) && c.getNombre().equalsIgnoreCase(apellidos)){
                System.out.println("El cliente ha sido encontrado.");
                listaCliente.remove(c);
                cuenta.setTitular(null);
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "entrada=" + entrada +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", listaCliente=" + listaCliente +
                '}';
    }

}
