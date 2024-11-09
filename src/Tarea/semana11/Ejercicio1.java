package Tarea.semana11;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalVentas = 0;

        // registrar las ventas en la matriz
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese venta: ");
                ventas[f][c] = lectura.nextInt();
                totalVentas += ventas[f][c];  // Sumar cada venta al total
            }
        }

        // Salida
        System.out.println("El total de las ventas es: " + totalVentas);
    }
}
