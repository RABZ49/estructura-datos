/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.verificar;
import java.util.Scanner;
/**
 *
 * @author busta
 */
public class Verificar {

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

        boolean estaOrdenado = metodos.verificarOrden(arreglo);

        if (estaOrdenado) {
            System.out.println("El arreglo está ordenado.");
        } else {
            System.out.println("El arreglo no está ordenado.");
        }
    }

    
}
