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

    public  Metodos (){

        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("insertar [1]");
        System.out.println("recorrer [2]");
        System.out.println("salir    [0]");
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
    public void insertar(){
    System.out.println("Ingrese dato: ");
        int num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        }else{
        tail.sig = nuevo;
        tail = tail.sig;
        }
    
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual!=null) {            
            System.out.println("-> "+actual.dato);
            actual = actual.sig;
            
        }
        System.out.println("null");
    }
}
