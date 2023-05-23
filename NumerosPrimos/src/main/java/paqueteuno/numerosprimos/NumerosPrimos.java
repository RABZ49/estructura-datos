/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.numerosprimos;
import java.util.Scanner;
/**
 *
 * @author busta
 */
public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        int lim;
        System.out.println("Ingrese el limite del arreglo: ");
        lim = scanner.nextInt();
            int n = lim; 

        int[] primes = metodos.generarNumerosPrimos(n);

        System.out.println("Números primos generados:");

        for (int i = 0; i < primes.length; i++) {
            System.out.println("Posición " + i + ": " + primes[i]);
        }
    }

    
}
