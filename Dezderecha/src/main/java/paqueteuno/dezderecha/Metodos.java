/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.dezderecha;

/**
 *
 * @author busta
 */
public class Metodos {
    public static int[] insertarElemento(int[] arreglo, int x, int k) {
        int n = arreglo.length;

        int[] nuevoArreglo = new int[n + 1];

        for (int i = 0; i < k; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        nuevoArreglo[k] = x;

        for (int i = k + 1; i < n + 1; i++) {
            nuevoArreglo[i] = arreglo[i - 1];
        }

        return nuevoArreglo;
    }
}
