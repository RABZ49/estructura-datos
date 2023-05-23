/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.numerosprimos;

/**
 *
 * @author busta
 */
public class Metodos {
    public static int[] generarNumerosPrimos(int n) {
        int[] primes = new int[n];

        int count = 0;
        int num = 2;

        while (count < n) {
            if (esPrimo(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }

        return primes;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
