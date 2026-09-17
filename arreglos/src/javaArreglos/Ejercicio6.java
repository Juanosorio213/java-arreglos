/*
Hacer un programa que escriba un boleto de bonoloto construido al azar, esto es, que muestre por
pantalla 6 números del 1 al 47. Pero sin números repetidos.
 */
package javaArreglos;

/**
 *
 * @author juan
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] bonoloto = new int[6];

        for (int i = 0; i < bonoloto.length; i++) {
            int numeroAleatorio;
            boolean repetido;

            do {
                // Generar número aleatorio entre 1 y 47
                numeroAleatorio = (int) (Math.random() * 47) + 1;
                repetido = false;

                // Comprobar si ya está en las posiciones anteriores
                for (int j = 0; j < i; j++) {
                    if (bonoloto[j] == numeroAleatorio) {
                        repetido = true;
                        break; // Salimos del bucle si encontramos una copia
                    }
                }
            } while (repetido); // Si está repetido, el 'do' se vuelve a ejecutar

            // Si no está repetido, lo guardamos en el array
            bonoloto[i] = numeroAleatorio;
        }

// Mostrar el boleto generado
        System.out.println("Tus números de la Bonoloto son:");
        for (int i = 0; i < bonoloto.length; i++) {
            System.out.print(bonoloto[i]+" ");
        }
    }
}
