/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.controlaviones;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class Metodos {

    private static final int NUMERO_PLAZAS_AVION = 100;
    private static final int PLAZAS_FUMADORES = 30;
    private static boolean[] plazasReservadas = new boolean[NUMERO_PLAZAS_AVION + 1];

    public static void realizarReserva(Scanner scanner) {
        System.out.print("Ingrese el número de la plaza que desea reservar: ");
        int numeroPlaza = scanner.nextInt();

        if (numeroPlaza < 1 || numeroPlaza > NUMERO_PLAZAS_AVION) {
            System.out.println("Número de plaza inválido. Por favor, "
                    + "ingrese un número de plaza válido.");
            return;
        }

        if (plazasReservadas[numeroPlaza]) {
            System.out.println("La plaza " + numeroPlaza + " ya está reservada. "
                    + "Por favor, elija otra plaza.");
        } else {
            plazasReservadas[numeroPlaza] = true;
            System.out.println("Reserva de la plaza " + numeroPlaza +
                    " realizada con éxito.");
        }
    }

    public static void cancelarReserva(Scanner scanner) {
        System.out.print("Ingrese el número de la plaza que"
                + " desea cancelar: ");
        int numeroPlaza = scanner.nextInt();

        if (numeroPlaza < 1 || numeroPlaza > NUMERO_PLAZAS_AVION) {
            System.out.println("Número de plaza inválido. Por favor, "
                    + "ingrese un número de plaza válido.");
            return;
        }

        if (!plazasReservadas[numeroPlaza]) {
            System.out.println("La plaza " + numeroPlaza + " no está reservada."
                    + " No se puede cancelar.");
        } else {
            plazasReservadas[numeroPlaza] = false;
            System.out.println("Cancelación de la reserva de la plaza "
                    + numeroPlaza + " realizada con éxito.");
        }
    }

    public static void mostrarEstadoPlazas() {
        System.out.println("Estado de las plazas:");

        for (int i = 1; i <= NUMERO_PLAZAS_AVION; i++) {
            if (i <= PLAZAS_FUMADORES) {
                System.out.print("F" + i + ": ");
            } else {
                System.out.print("NF" + i + ": ");
            }

            if (plazasReservadas[i]) {
                System.out.println("Reservada");
            } else {
                System.out.println("Libre");
            }
        }
    }
}
