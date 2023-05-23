/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.verificar;

/**
 *
 * @author busta
 */
public class Metodos {
    public static boolean verificarOrden(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {
            if (arreglo[i] < arreglo[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
