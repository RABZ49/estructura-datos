/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlacecompleto;

/**
 *
 * @author UTPL
 */
public class Nodo extends Persona {

    float[] calif;
    Nodo sig;

    public Nodo(float[] calif, int Id, String nombre, char sexo) {
        super(Id, nombre, sexo);
        this.calif = calif;
        this.sig = null;
    }

    public float getProm() {
        float suma = 0;
        for (float nota : calif) {
            suma += nota;
        }
        return suma / calif.length;
    }

}
