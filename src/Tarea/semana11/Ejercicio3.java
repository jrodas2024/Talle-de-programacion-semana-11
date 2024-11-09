package Tarea.semana11;

/**
 *
 * @author Server
 */
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int ventaMayor = 10;
        int ventaMenor = 5000;

        // generar ventas aleatorias entre 10 y 5000
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                ventas[f][c] = random.nextInt(5000 - 10 + 1) + 10;
                System.out.println("Venta generada: " + ventas[f][c]);

                // Proceso: determinar la venta mayor y menor
                if (ventas[f][c] > ventaMayor) {
                    ventaMayor = ventas[f][c];
                }
                if (ventas[f][c] < ventaMenor) {
                    ventaMenor = ventas[f][c];
                }
            }
        }

        // Salida
        System.out.println("La venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}
