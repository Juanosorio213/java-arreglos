/*
Parcial pasado
 */
package javaArreglos;

import java.util.Scanner;

/**
 * Evaluacion 1 - Programacion Orientada a Objetos
 * @author juan
 */
public class Ejercicio12 {

    // 1. Método para generar o rellenar los datos de la subestación (aleatorio o manual)
    public static void generarDatos(double[] vec, boolean aleatorio, double min, double max) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vec.length; i++) {
            if (aleatorio) {
                // Generar temperatura aleatoria entre min y max
                vec[i] = min + (Math.random() * (max - min));
            } else {
                // Ingreso manual por teclado
                System.out.print("Ingrese temperatura para el mes " + (i + 1) + ": ");
                vec[i] = sc.nextDouble();
            }
        }
    }

    // 2. Método para calcular el promedio anual de un arreglo
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }
        return suma / temperaturas.length;
    }

    // 3. Método reporteMensual: Imprime resumen estadístico, meses min/max y promedio
    public static void reporteMensual(String nombre, double[] temperaturas) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("\n========================================");
        System.out.println(" REPORTE ESTADÍSTICO: " + nombre.toUpperCase());
        System.out.println("========================================");

        double suma = 0;
        double maxTemp = temperaturas[0];
        double minTemp = temperaturas[0];
        int mesMax = 0;
        int mesMin = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(meses[i] + ": " + String.format("%.2f", temperaturas[i]) + " °C");
            suma += temperaturas[i];

            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
                mesMax = i;
            }
            if (temperaturas[i] < minTemp) {
                minTemp = temperaturas[i];
                mesMin = i;
            }
        }

        double promedio = suma / temperaturas.length;
        System.out.println("----------------------------------------");
        System.out.println("Promedio Anual: " + String.format("%.2f", promedio) + " °C");
        System.out.println("Temperatura MÁS ALTA: " + String.format("%.2f", maxTemp) + " °C (" + meses[mesMax] + ")");
        System.out.println("Temperatura MÁS BAJA: " + String.format("%.2f", minTemp) + " °C (" + meses[mesMin] + ")");
    }

    // 4. Método detectarAnomalias: Devuelve los índices de los meses con anomalías (+/- 20% del promedio)
    public static int[] detectarAnomalias(double[] temperaturas) {
        double promedio = calcularPromedio(temperaturas);
        double limiteInferior = promedio * 0.80; // -20%
        double limiteSuperior = promedio * 1.20; // +20%

        // Primero contamos cuántas anomalías hay para dimensionar el array exacto
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < limiteInferior || temperaturas[i] > limiteSuperior) {
                contador++;
            }
        }

        // Creamos el array de resultados con el tamaño exacto
        int[] anomalias = new int[contador];
        int pos = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < limiteInferior || temperaturas[i] > limiteSuperior) {
                anomalias[pos] = i; // Guardamos el índice del mes
                pos++;
            }
        }

        return anomalias;
    }

    // 5. Método compararSubestaciones: Compara dos subestaciones según su promedio anual
    public static String compararSubestaciones(String nombre1, double[] t1, String nombre2, double[] t2) {
        double prom1 = calcularPromedio(t1);
        double prom2 = calcularPromedio(t2);

        if (prom1 > prom2) {
            return nombre1 + " es más cálida (Promedio: " + String.format("%.2f", prom1) + " °C) en comparación con " + nombre2 + " (" + String.format("%.2f", prom2) + " °C).";
        } else if (prom2 > prom1) {
            return nombre2 + " es más cálida (Promedio: " + String.format("%.2f", prom2) + " °C) en comparación con " + nombre1 + " (" + String.format("%.2f", prom1) + " °C).";
        } else {
            return "Ambas subestaciones tienen el mismo promedio térmico (" + String.format("%.2f", prom1) + " °C).";
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Declarar tres arreglos de tipo double con 12 posiciones (Rivera, Neiva, Campoalegre)
        double[] rivera = new double[12];
        double[] neiva = new double[12];
        double[] campoalegre = new double[12];

        // Definimos si los datos se generan de forma aleatoria (true) o manual (false)
        boolean generarAleatorio = true;
        double tempMinima = 18.0;
        double tempMaxima = 38.0;

        // Llenar los arreglos con datos simulados
        generarDatos(rivera, generarAleatorio, tempMinima, tempMaxima);
        generarDatos(neiva, generarAleatorio, tempMinima, tempMaxima);
        generarDatos(campoalegre, generarAleatorio, tempMinima, tempMaxima);

        // Aplicar métodos de análisis y mostrar reportes mensuales
        reporteMensual("Rivera", rivera);
        reporteMensual("Neiva", neiva);
        reporteMensual("Campoalegre", campoalegre);

        // Mostrar detección de anomalías térmicas
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("\n========================================");
        System.out.println(" ANÁLISIS DE ANOMALÍAS TÉRMICAS (+/- 20%)");
        System.out.println("========================================");
        
        int[] anomaliasNeiva = detectarAnomalias(neiva);
        System.out.print("Meses con anomalías en Neiva: ");
        for (int i = 0; i < anomaliasNeiva.length; i++) {
            System.out.print(meses[anomaliasNeiva[i]] + " ");
        }
        System.out.println();

        // Mostrar resultados comparativos entre las tres subestaciones
        System.out.println("\n========================================");
        System.out.println(" RESULTADOS COMPARATIVOS");
        System.out.println("========================================");
        System.out.println(compararSubestaciones("Neiva", neiva, "Rivera", rivera));
        System.out.println(compararSubestaciones("Neiva", neiva, "Campoalegre", campoalegre));
    }
}