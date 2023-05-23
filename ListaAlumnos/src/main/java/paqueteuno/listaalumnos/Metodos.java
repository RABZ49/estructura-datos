/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.listaalumnos;

import java.util.List;

/**
 *
 * @author busta
 */
public class Metodos {
        public static boolean buscarNombre(List<String> listaNombres, String nombreBuscar) {
        for (String nombre : listaNombres) {
            if (nombre.equalsIgnoreCase(nombreBuscar)) {
                return true;
            }
        }
        return false;
    }
}
