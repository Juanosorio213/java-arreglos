/*
Hacer un método
soloMultiplos(numEnteros, n)
que reciba una lista de una dimensión de números enteros y un número entero, y que devuelva una
lista que contenga sólo los multiplos de ese número que aparecen en la lista original.
 */
package javaArreglos;

/**
 *
 * @author juan
 */
public class Ejercicio8 {
    public static void main(String[] args) {
    int[] listaOriginal = {2, 4, 5, 6, 8, 10, 11};
    int n = 2; // Queremos los múltiplos de 2
    
    int[] resultado = soloMultiplos(listaOriginal, n);
    
    // Imprimir el resultado
    System.out.println("Múltiplos encontrados:");
    for (int i = 0; i < resultado.length; i++) {
        System.out.print(resultado[i] + " ");
    }
}

    public static int[] soloMultiplos(int[] numEnteros, int n) {
        // 1. Contar cuántos múltiplos existen para definir el tamaño del nuevo array
        int contador = 0;
        for (int i = 0; i < numEnteros.length; i++) {
            if (numEnteros[i] % n == 0) {
                contador++;
            }
        }

        // 2. Crear el nuevo array con el tamaño exacto obtenido
        int[] resultado = new int[contador];
        int pos = 0;

        // 3. Rellenar el nuevo array con los múltiplos encontrados
        for (int i = 0; i < numEnteros.length; i++) {
            if (numEnteros[i] % n == 0) {
                resultado[pos] = numEnteros[i];
                pos++;
            }
        }

        // 4. Devolver el nuevo array filtrado
        return resultado;
    }
}
