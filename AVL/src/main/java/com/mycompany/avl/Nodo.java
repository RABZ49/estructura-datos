/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avl;

/**
 *
 * @author Vicente
 */
public class Nodo {
    int dato;
    int fe;
    Nodo izq;
    Nodo der;
    
    public Nodo(int _dato){
        this.dato = _dato;
        this.fe = _dato;
        this.izq = this.der = null;
    }
    
}
