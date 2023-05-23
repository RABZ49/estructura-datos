/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package paqueteuno.controlaviones;

import java.util.Scanner;

/**
 *
 * @author busta
 */
public class ControlAviones {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al sistema de control de reservas del vuelo Quito-Loja");
            System.out.println("1. Realizar una reserva");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar estado de las plazas");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    metodos.realizarReserva(scanner);
                    break;
                case 2:
                    metodos.cancelarReserva(scanner);
                    break;
                case 3:
                    metodos.mostrarEstadoPlazas();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de control de reservas. ¡Buen viaje!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        }
    }

}
