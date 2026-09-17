/*
Realizar un programa que lea por teclado un array de 10 elementos numéricos enteros. Guardar en
un nuevo array todos los elementos pares del primer array, y a continuación los elementos impares.
 */
package javaArreglos;

/**
 *
 * @author juan
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] numeros = new int[10];


        System.out.println("Array generado:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20) + 1; 
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 


        boolean hayRepetidos = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i != j && numeros[i] == numeros[j]) {
                    hayRepetidos = true;
                    break; 
                }
            }
            if (hayRepetidos) {
                break; 
            }
        }


        if (hayRepetidos) {
            System.out.println("Sí, existe al menos un número repetido.");
        } else {
            System.out.println("No, no hay ningún número repetido.");
        }
    }
}
