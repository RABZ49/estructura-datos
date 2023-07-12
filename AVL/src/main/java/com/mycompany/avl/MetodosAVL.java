
package com.mycompany.avl;
import java.util.Scanner;

/**
 *
 * @author Vicente
 */
public class MetodosAVL {
    Nodo raiz;
    Scanner entrada;
    boolean h;
    
    public MetodosAVL(){
        this.raiz = null;
        this.entrada = new Scanner (System.in);
        this.h = false;
    }
    
    public int menu(){
        System.out.println("Insertar   [1]");
        System.out.println("Recorrer   [2]");
        System.out.println("Eliminar   [3]");
        System.out.println("Salir      [0]");
        return entrada.nextInt();
    }
    
    
    public Nodo rotarII(Nodo actual, Nodo nodox){
        actual.izq = nodox.der;
        nodox.der = actual;
        
        actual.fe = 0;
        nodox.fe = 0;
        
        return nodox;
    }
    public void inOrden(Nodo actual){
        if (actual!= null) {
            inOrden(actual.izq);
            System.out.println(actual.dato+ "->"+actual.fe+"\n");
            inOrden(actual.der);
            System.out.println("");
        }
    }
    public Nodo rotarID(Nodo actual,Nodo nodoX){
        Nodo aux = nodoX.der;
        actual.izq = aux.der;
        nodoX.der = aux.izq;
        aux.izq = nodoX;
        aux.der = actual;
        actual.fe = 0;
        nodoX.fe = 0;
        
        return aux;
    }
    public Nodo rotarDI(Nodo actual,Nodo nodoX){
        Nodo aux = nodoX.izq;
        actual.izq = aux.izq;
        nodoX.izq = aux.der;
        aux.der = nodoX;
        aux.izq = actual;
        actual.fe = 0;
        nodoX.fe = 0;
        
        return aux;
    }
    
    public Nodo rotarDD(Nodo actual, Nodo nodox){
        actual.der = nodox.izq;
        nodox.izq = actual;
        
        actual.fe = 0;
        nodox.fe = 0;
        
        return nodox;
    }
    
    public Nodo insertarAVL(int num, Nodo actual){
        if(actual == null){
            Nodo nuevo = new Nodo(num);
            h =  true;
            return nuevo;
        }else if(num < actual.dato){
            actual.izq = insertarAVL(num, actual.izq);
            if(h){
                switch(actual.fe){
                    case -1 -> {
                        Nodo nodox = actual.izq;
                        if (nodox.fe == -1)
                        actual = rotarII(actual, nodox);
                        else 
                            actual = rotarID(actual,nodox);
                    }
                    case 0 -> actual.fe = -1;
                    case 1 -> {
                    actual.fe = 0;
                    h = false;
                    }
                }
            }
        }else if(num > actual.dato){
            actual.der = insertarAVL(num, actual.der);
            if(h){
                switch(actual.fe){
                    case -1 -> {
                        actual.fe = 0;
                        h = false;
                    }
                    case 0 -> actual.fe = 1;
                    case 1 -> {   
                    Nodo nodox = actual.der;
                    if(nodox.fe == 1)
                        actual = rotarDD(actual, nodox);
                    else
                        actual = rotarDI(actual, nodox);
                    }
                }
            }
            
        }else{
            System.out.println("No se aceptan repetidos...");
        }
        return actual;
    }
}
