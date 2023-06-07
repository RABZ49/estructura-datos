/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1b2;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Nodo head = null;
    Nodo tail = null;
    Scanner entrada;

    public Metodos() {

        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("insertar  final  [1]");
        System.out.println("recorrer         [2]");
        System.out.println("insertar inicio  [3]");
        System.out.println("ordenar          [4]");
        System.out.println("eliminar         [5]");
        System.out.println("salir            [0]");
        int x = entrada.nextInt();
        return x;

    }

    public boolean listaVacia() {
        return (head == null);
    }

    /*public void insertar() {

        System.out.println("Ingrese dato: ");
        int num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;

        } else {
            Nodo actual = head;
            while (actual.sig != null) {
                actual = actual.sig;
                
            }
            actual.sig = nuevo;
        }
    }*/
    public void insertar() {
        System.out.println("Ingrese dato: ");
        int num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = tail.sig;
        }

    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + "-> ");
            actual = actual.sig;

        }
        System.out.println("null");
    }

    public void insInicio() {
        System.out.println("Ingrese dato: ");
        int num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }

    }

    public void insOrden() {
        System.out.println("Ingrese dato: ");
        int num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num < head.dato) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                if (true) {
                    while ((actual.sig != null) && (num > actual.sig.dato)) {
                        actual = actual.sig;

                    }
                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;
                    if (nuevo.sig == null) {
                        tail = nuevo;
                    }
                }
            }
        }

    }

    public void eliminar() {
        System.out.println("ingrese el dato:");
        int num = entrada.nextInt();
        if (num == head.dato) {
            if (head.sig == null) {
                tail = null;

            }
            head = head.sig;
        }
        Nodo actual = head;
        while ((actual.sig != null) && (actual.sig.dato != num)) {
            actual = actual.sig;

        }if (actual.sig == tail) {
            tail = actual;
            
        }if (actual.sig!=null) {
            actual.sig=actual.sig.sig;
        }else{
        System.out.println("El elemento no existe");
        }

    }

}
