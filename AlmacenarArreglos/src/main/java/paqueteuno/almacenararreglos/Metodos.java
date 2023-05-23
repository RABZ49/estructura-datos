/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.almacenararreglos;

/**
 *
 * @author busta
 */
public class Metodos {
        public static long[] calcularFactoriales(int[] A) {
        long[] B = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = factorial(A[i]);
        }

        return B;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
