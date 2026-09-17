/*
Realizar un método que reciba una array de números enteros y devuelva un array de números
enteros, que sería el array recibido pero sin ningún número repetido. Probar el funcionamiento del
método con un array de 20 números enteros entre 1 y 10 elegidos de forma aleatoria.
 */
package javaArreglos;

/**
 * @author juan
 */
public class Ejercicio11 {

    // Método que recibe un array y devuelve uno nuevo sin números repetidos
    public static int[] eliminarRepetidos(int[] vectorOriginal) {
        // 1. Contar cuántos elementos únicos existen
        int contadorUnicos = 0;
        for (int i = 0; i < vectorOriginal.length; i++) {
            boolean esPrimeraVez = true;
            // Revisamos si el número ya había aparecido antes en el array
            for (int j = 0; j < i; j++) {
                if (vectorOriginal[i] == vectorOriginal[j]) {
                    esPrimeraVez = false;
                    break;
                }
            }
            if (esPrimeraVez) {
                contadorUnicos++;
            }
        }

        // 2. Crear el nuevo array con el tamaño exacto de elementos únicos
        int[] resultado = new int[contadorUnicos];
        int pos = 0;

        // 3. Rellenar el nuevo array con los valores únicos
        for (int i = 0; i < vectorOriginal.length; i++) {
            boolean esPrimeraVez = true;
            for (int j = 0; j < i; j++) {
                if (vectorOriginal[i] == vectorOriginal[j]) {
                    esPrimeraVez = false;
                    break;
                }
            }
            if (esPrimeraVez) {
                resultado[pos] = vectorOriginal[i];
                pos++;
            }
        }

        // 4. Devolver el array filtrado
        return resultado;
    }

    // Método principal (main) para probarlo
    public static void main(String[] args) {
        int[] original = new int[20];

        // Rellenar con 20 números aleatorios del 1 al 10
        System.out.println("--- ARRAY ORIGINAL (20 números) ---");
        for (int i = 0; i < original.length; i++) {
            original[i] = (int) (Math.random() * 10) + 1;
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Llamamos al método para eliminar los repetidos
        int[] sinRepetidos = eliminarRepetidos(original);

        // Mostrar el resultado final
        System.out.println("\n--- ARRAY SIN NÚMEROS REPETIDOS ---");
        for (int i = 0; i < sinRepetidos.length; i++) {
            System.out.print(sinRepetidos[i] + " ");
        }
        System.out.println();
    }
}