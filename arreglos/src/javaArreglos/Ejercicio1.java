
package javaArreglos;

/*
Escribe un programa que lea 5 números por teclado y que los almacene en un array. Rota los
elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la
2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
muestra el contenido del array.
*/
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] numeros = new double[5];
            
            System.out.println("Introduce 5 numeros: ");
            for (int i=0; i<5; i++){
                System.out.println("Numero "+(i+1)+ ": ");
                numeros[i]= sc.nextDouble();
            }
            
            System.out.println("Array original: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(numeros[i] + (i < 4 ? ", " : ""));
            }
            System.out.println("]");
            
            
            double ultimo = numeros[4];
            
            // Desplazamos los elementos hacia la derecha desde el final
            for (int i = 4; i > 0; i--) {
                numeros[i] = numeros[i - 1];
            }
            
            // Colocamos el último elemento en la primera posición (índice 0)
            numeros[0] = ultimo;
            
            // 3. Mostrar el contenido final del array rotado
            System.out.print("Array rotado:   [");
            for (int i = 0; i < 5; i++) {
                System.out.print(numeros[i] + (i < 4 ? ", " : ""));
            }
            System.out.println("]");
        }
    }
}