/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;
import java.util.Scanner;
/**
 *
 * @author jdavi
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizX[][] = new int[3][3];
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz X:\n", i, j);
                matrizX[i][j] = entrada.nextInt();
            }
        }
    }
}
