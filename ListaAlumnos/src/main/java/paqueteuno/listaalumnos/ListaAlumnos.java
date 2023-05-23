/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.listaalumnos;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class ListaAlumnos {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");
        listaNombres.add("Ana");
        listaNombres.add("Luis");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscar = scanner.nextLine();

        if (metodos.buscarNombre(listaNombres, nombreBuscar)) {
            System.out.println("El nombre " + nombreBuscar + " se encuentra en "
                    + "la lista de alumnos.");
        } else {
            System.out.println("El nombre " + nombreBuscar + " no se encuentra "
                    + "en la lista de alumnos.");
        }
    }

}
