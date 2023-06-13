/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlacecompleto;

/**
 *
 * @author UTPL
 */
public class Nodo extends Persona{
    float[] calificaciones;
    Nodo sig;

    public Nodo(float[] calificaciones, Nodo sig, int ide, String nom, char sex) {
        super(ide, nom, sex);
        this.calificaciones = calificaciones;
        this.sig = sig;
    }
    public float calcularPromedio(){
        float suma = 0;
        for (float nota : calificaciones) {
            
        }
    
    }

    
}
