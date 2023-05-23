/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.suma;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author busta
 */
public class Suma {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
       List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(7);
        lista.add(4);
        lista.add(9);
        lista.add(6);
        
        int sumaPares = metodos.sumarPares(lista);
        int sumaImpares = metodos.sumarImpares(lista);
        
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
    
    
}
