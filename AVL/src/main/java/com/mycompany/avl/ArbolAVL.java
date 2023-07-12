/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avl;

/**
 *
 * @author Vicente
 */
public class ArbolAVL {

    public static void main(String[] args) {
        int op, num;
        MetodosAVL myArbol = new MetodosAVL();
        
        
        do {            
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    System.out.println("Valor a insertar: ");
                    num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.insertarAVL(num, myArbol.raiz);
                }
                case 2 -> {
                    myArbol.inOrden(myArbol.raiz);
                    System.out.println(" ");
                }
                default -> throw new AssertionError();
            }
        } while (op!=0);
    }
}
