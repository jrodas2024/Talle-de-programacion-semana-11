package Tarea.semana11;

/**
 *
 * @author Server
 */
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;

        // generar ventas aleatorias entre 1000 y 10000
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                ventas[f][c] = random.nextInt(10000 - 1000 + 1) + 1000;
                System.out.println("Venta generada: " + ventas[f][c]);
                totalVentas += ventas[f][c];  // Sumar cada venta al total
            }
        }

        // Proceso
        int totalElementos = ventas.length * ventas[0].length;
        double promedioVentas = (double) totalVentas / totalElementos;

        // Salida
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
    }
}