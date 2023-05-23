/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author busta
 */
public class calcular {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();
        Metodos metodos = new Metodos();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int negativos = metodos.contarNegativos(vector);
        int ceros = metodos.contarCeros(vector);
        int positivos = metodos.contarPositivos(vector);

        System.out.println("Número de elementos negativos: " + negativos);
        System.out.println("Número de ceros: " + ceros);
        System.out.println("Número de elementos positivos: " + positivos);
    }


}