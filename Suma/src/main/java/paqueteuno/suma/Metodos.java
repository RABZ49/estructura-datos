/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.suma;

import java.util.List;

/**
 *
 * @author busta
 */
public class Metodos {
    public static int sumarPares(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }
    
    public static int sumarImpares(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }
}
