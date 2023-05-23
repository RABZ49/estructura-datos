/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.numeroramdom;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class NumeroRamdom {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] T = metodos.generarArregloAleatorio(n);

        System.out.println("Arreglo original T:");
        metodos.mostrarArreglo(T);

        System.out.print("Ingrese el valor de i: ");
        int i = scanner.nextInt();

        if (i >= 0 && i < n) {
            int[] nuevoArreglo = metodos.dividirArreglo(T, i);

            System.out.println("Nuevo arreglo resultante:");
            metodos.mostrarArreglo(nuevoArreglo);
        } else {
            System.out.println("El valor de i no es válido.");
        }
    }


}
