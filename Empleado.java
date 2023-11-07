package Pregunta3;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    public void leerDatos() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = input.nextLine();

        System.out.print("Ingrese el número de empleado: ");
        numeroEmpleado = input.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }
}