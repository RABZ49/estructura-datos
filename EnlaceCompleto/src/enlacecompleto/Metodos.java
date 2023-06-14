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

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
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
        Nodo nuevo = leerDatos();
        if (listaVacia()) {
            head = nuevo;
        } else if (nuevo.Id < head.Id) {
            nuevo.sig = head;
            head = nuevo;
        } else {
            Nodo actual = head;
            while ((actual.sig != null) && (nuevo.Id > actual.sig.Id)) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;
        }
    }

    public Nodo leerDatos() {
        int Id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        System.out.println("INGRESE ID: ");
        Id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("INGRESE EL NOMBRE: ");
        nombre = entrada.nextLine();
        System.out.println("INGRESE SEXO: ");
        sexo = entrada.nextLine().toUpperCase().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("INGRESE LA CALIFICACION " + (i + 1) + " : ");
            calif[i] = entrada.nextFloat();
        }
        Nodo nuevo = new Nodo(calif, Id, nombre, sexo);
        return nuevo;
    }

    public void listar() {
        if (listaVacia()) {
            System.out.println("No existen elementos...");

        } else {
            Nodo actual = head;
            while (actual != null) {
                System.out.println("=======\n" + " id: " + actual.Id
                        + "\nNombre: "
                        + actual.nombre + "\n=======\n");
                actual = actual.sig;
            }
        }

    }

    public void reporte(char x) {

        Nodo actual = head;
        while (actual != null) {
            if (actual.sexo == x) {
                if (actual.getProm() >= 7) {
                    System.out.println("El estudiante: " + actual.nombre
                            + " está APROBADO");
                } else {
                    System.out.println("El estudiante: " + actual.nombre
                            + " está REPROBADO");
                }
            }
            actual = actual.sig;
        }
    }

    public void eliminar() {
        int Id;
        System.out.println("Id del estudinate a eliminar: ");
        Id = entrada.nextInt();
        if (listaVacia()) {
            System.out.println("Lista Vacias........");
        } else {
            if (Id == head.Id) {
                head = head.sig;
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (actual.sig.Id != Id)) {
                    actual = actual.sig;
                }
                if (actual.sig == null) {
                    System.out.println("El estudinate no existe........");
                } else {
                    actual.sig = actual.sig.sig;
                }
            }
        }
    }
}
