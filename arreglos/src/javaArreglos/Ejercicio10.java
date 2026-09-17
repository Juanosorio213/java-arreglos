/*
5.b.10.Crear un método que recibe dos enteros (A y C) y calcula y devuelve A elevado a C
 */
package javaArreglos;

/**
 * @author juan
 */
public class Ejercicio10 {

    // Método que recibe A y C, y calcula A elevado a C
    public static int calcularPotencia(int a, int c) {
        int resultado = 1;
        
        // Multiplicamos 'a' por sí mismo 'c' veces
        for (int i = 0; i < c; i++) {
            resultado *= a;
        }
        
        return resultado;
    }

    // Método principal (main) para probarlo
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        
        int resultado = calcularPotencia(base, exponente);
        
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }
}