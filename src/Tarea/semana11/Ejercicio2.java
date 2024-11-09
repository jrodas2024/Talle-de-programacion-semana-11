package Tarea.semana11;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] compras = new int[4][4];
        int totalCompras = 0;

       //registrar las compras en la matriz
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese compra: ");
                compras[f][c] = lectura.nextInt();
                totalCompras += compras[f][c];
            }
        }

        // calcular el promedio
        int totalElementos = compras.length * compras[0].length;
        double promedioCompras = (double) totalCompras / totalElementos;

        // Salida
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}