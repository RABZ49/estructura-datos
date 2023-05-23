/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.almacenararreglos;

/**
 *
 * @author busta
 */
public class AlmacenarArreglos {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long[] b = metodos.calcularFactoriales(a);

        System.out.println("Factoriales calculados:");

        for (int i = 0; i < b.length; i++) {
            System.out.println(a[i] + "! = " + b[i]);
        }
    }


}
