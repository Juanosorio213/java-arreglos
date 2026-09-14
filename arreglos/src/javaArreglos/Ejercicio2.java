/*
Rellenar aleatoriamente un array de 10 números enteros. Debemos mostrarlos en el siguiente orden: el
primero, el último, el segundo, el penúltimo, el tercero, etc.
 */
package javaArreglos;

import java.util.Random;

/**
 *
 * @author juan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numeros[]= new int [10];
        Random random = new Random();
        
        for(int i = 0;i<numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }
        
        System.out.println("Array Original: ");
        for (int i=0;i<numeros.length;i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println("Array Alterntivo: ");
        int izquierda=0;
        int derecha= numeros.length-1;
        
        while (izquierda <= derecha) {
            System.out.println(numeros[izquierda]);
            izquierda++;
            
            if (izquierda<= derecha) {
                System.out.println(numeros[derecha]);
                derecha--;
            }
        
        }
    }
}
