/*
Realizar un programa que pida por teclado 10 números enteros. Guardar en otro array los elementos
pares del primero, y en el mismo array, a continuación, los elementos impares
 */
package javaArreglos;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        System.out.println("Introduce 10 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

            int resultado[] = new int[10];
            int pos = 0;
            System.out.println("Array Final: ");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    resultado[pos] = numeros[i];
                    pos++;

                }
            }
            for (int i=0; i< numeros.length; i++) {
                if (numeros[i] % 2 == 1) {
                    resultado[pos] = numeros[i];
                    pos++;
                    
                }
                
            }
            for(int i=0;i<resultado.length; i++) {
                System.out.println(resultado[i]);
            }
            

       

    }
}
