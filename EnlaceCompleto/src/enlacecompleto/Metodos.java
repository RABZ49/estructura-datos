/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlacecompleto;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Nodo head;
    Scanner entrada;

    public Metodos(Nodo head, Scanner entrada) {
        this.head = head;
        this.entrada = entrada;
    }

    public int menu() {
        System.out.println("insertar         [1]: ");
        System.out.println("eliminar         [2]: ");
        System.out.println("reporte varones  [3]: ");
        System.out.println("reporte damas    [4]: ");
        System.out.println("lista            [5]: ");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        
        Nodo nuevo = leerData();
        Nodo actual = head;
        if (listaVacia()) {
            head = nuevo;
        } else {
            
            if (nuevo.id < head.id) {
                nuevo.sig = head;
                head = nuevo;
                while ((actual.sig != null)&&(nuevo.id > actual.sig.id)) {                    
                    
                }

            }
        }
    }

    public Nodo leerData() {
        int id;
        String nombre;
        char sexo;
        float[] calificaciones = new float[3];
        System.out.println("ingrese id: ");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sexo: ");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese la calificacion:");
            calificaciones[i] = entrada.nextFloat();

        }
        Nodo nuevo = new Nodo(calificaciones, head, id, nombre, sexo);
        return nuevo;
    }
}
