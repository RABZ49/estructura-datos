/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteuno.fibonaci;
import java.util.Scanner;
/**
 *
 * @author busta
 */
public class Fibonaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        int lim;
        System.out.println("Ingrese el limite de datos: ");
        lim = scanner.nextInt();
            int n = lim;

        System.out.println("Secuencia de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            int resultado = metodos.fibonacci(i);
            System.out.print(resultado + " ");
        }
    }

    
}
