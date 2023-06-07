/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1b2;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        int op;
        
        Metodos myLista = new Metodos();
        do {
            op = myLista.menu();
            switch (op) {
                case 1:
                    myLista.insertar();
                    break;
                case 2:
                    myLista.recorrer();
                    break;
                case 3:
                    myLista.insInicio();
                    break;
                case 4:
                    myLista.insOrden();
                    break;
                case 5:
                    myLista.eliminar();
                    break;

                default:
                    System.out.println("adios");
            }
        } while (op != 0);

    }
}
