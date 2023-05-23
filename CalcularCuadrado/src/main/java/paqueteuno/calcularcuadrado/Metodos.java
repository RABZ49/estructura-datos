/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.calcularcuadrado;

/**
 *
 * @author busta
 */
public class Metodos {
    public static int[] calcularCuadrados(int n) {
        int[] cuadrados = new int[n];
        for (int i = 0; i < n; i++) {
            cuadrados[i] = (i + 1) * (i + 1);
        }
        return cuadrados;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
