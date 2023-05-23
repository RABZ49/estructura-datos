/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.numeroramdom;

/**
 *
 * @author busta
 */
public class Metodos {
        public static int[] generarArregloAleatorio(int n) {
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = generarNumeroAleatorioNoCero();
        }

        return arreglo;
    }

    public static int generarNumeroAleatorioNoCero() {
        int num;

        do {
            num = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 99
        } while (num == 0);

        return num;
    }

    public static int[] dividirArreglo(int[] T, int i) {
        int n = T.length;
        int divisor = T[i];

        int[] nuevoArreglo = new int[n];

        for (int j = 0; j < n; j++) {
            nuevoArreglo[j] = T[j] / divisor;
        }

        return nuevoArreglo;
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
