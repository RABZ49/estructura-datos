/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.mavenproject1;

/**
 *
 * @author busta
 */
public class Metodos {
        public static int contarNegativos(int[] vector) {
        int count = 0;

        for (int elemento : vector) {
            if (elemento < 0) {
                count++;
            }
        }

        return count;
    }

    public static int contarCeros(int[] vector) {
        int count = 0;

        for (int elemento : vector) {
            if (elemento == 0) {
                count++;
            }
        }

        return count;
    }

    public static int contarPositivos(int[] vector) {
        int count = 0;

        for (int elemento : vector) {
            if (elemento > 0) {
                count++;
            }
        }

        return count;
    }
}
