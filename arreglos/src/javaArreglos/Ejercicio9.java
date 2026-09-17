/*
Realizar un método
ordenar( Empleado [] unvector)
que permita ordenar el array de objetos de tipo empleados por su sueldo (de mayor a menor). Cada
empleado tiene como atributos el nombre y el sueldo.
 */
package javaArreglos;

/**
 * @author juan
 */
public class Ejercicio9 {

    // Definición de la clase Empleado dentro de Ejercicio9
    public static class Empleado {
        String nombre;
        double sueldo;

        // Constructor
        public Empleado(String nombre, double sueldo) {
            this.nombre = nombre;
            this.sueldo = sueldo;
        }
    }

    // Método para ordenar los empleados por sueldo de mayor a menor
    public static void ordenar(Empleado[] unvector) {
        for (int i = 0; i < unvector.length - 1; i++) {
            for (int j = 0; j < unvector.length - 1 - i; j++) {
                // Si el sueldo actual es menor que el siguiente, los intercambiamos
                if (unvector[j].sueldo < unvector[j + 1].sueldo) {
                    Empleado aux = unvector[j];
                    unvector[j] = unvector[j + 1];
                    unvector[j + 1] = aux;
                }
            }
        }
    }

    // Método principal (main) para probarlo
    public static void main(String[] args) {
        // Creamos un array de prueba con varios empleados
        Empleado[] listaEmpleados = {
            new Empleado("Ana", 1200.50),
            new Empleado("Carlos", 2800.00),
            new Empleado("Beatriz", 1750.25),
            new Empleado("David", 3100.00)
        };

        // Mostrar antes de ordenar
        System.out.println("--- EMPLEADOS SIN ORDENAR ---");
        for (Empleado listaEmpleado : listaEmpleados) {
            System.out.println("Nombre: " + listaEmpleado.nombre + " | Sueldo: " + listaEmpleado.sueldo);
        }

        // Llamamos al método de ordenar
        ordenar(listaEmpleados);

        // Mostrar después de ordenar
        System.out.println("\n--- EMPLEADOS ORDENADOS (DE MAYOR A MENOR SUELDO) ---");
        for (Empleado listaEmpleado : listaEmpleados) {
            System.out.println("Nombre: " + listaEmpleado.nombre + " | Sueldo: " + listaEmpleado.sueldo);
        }
    }
}