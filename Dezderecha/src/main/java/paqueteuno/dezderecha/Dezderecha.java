/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.dezderecha;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Dezderecha {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el valor a insertar: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el indice donde insertar el dato: ");
        int k = scanner.nextInt();

        if (k >= 0 && k <= n) {
            int[] nuevoArreglo = metodos.insertarElemento(arreglo, x, k);

            System.out.println("Arreglo resultante:");
            System.out.println(Arrays.toString(nuevoArreglo));
        } else {
            System.out.println("El indice  no es válida.");
        }
    }

}
