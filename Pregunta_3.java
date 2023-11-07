package Pregunta3;

public class Pregunta_3 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[50]; // Crear un arreglo de empleados

        // Llenar el arreglo con datos correspondientes a 50 empleados
        for (int i = 0; i < 50; i++) {
            System.out.println("Datos del empleado #" + (i + 1) + ":");
            empleados[i] = new Empleado(); // Crear un objeto Empleado en la posición i
            empleados[i].leerDatos(); // Llamar al método para leer datos
        }

        System.out.println("Datos de todos los empleados:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Empleado #" + (i + 1) + ":");
            empleados[i].verDatos(); // Llamar al método para visualizar datos
        }
    }
}
