/*
Realiza un programa que lea 8 números por teclado, y muestre al final los repetidos. Cada número
repetido será mostrado una sola vez
 */
package javaArreglos;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[8];
        System.out.println("Introduce 8 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros que se repiten: ");
        for (int i = 0; i < numeros.length; i++) {
            int repetidos = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos++;
                }
            }

            if (repetidos > 1) {
                System.out.println(numeros[i]);
            }

        }
    }
}
