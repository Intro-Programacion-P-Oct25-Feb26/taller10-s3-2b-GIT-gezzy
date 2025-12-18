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
        int i;
        int j;
        int igual = 0;
        int diferentes = 0;
        for (i = 0; i < matrizX.length; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz X:\n", i, j);
                matrizX[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < matrizX.length; i++) {
            for (j = 0; j < 3; j++) {
                matrizA[i][j] = (matrizX[i][j] + 1) * (matrizX[i][j] + 1);
                matrizB[i][j] = (matrizX[i][j]) * (matrizX[i][j] + 2)
                        * (matrizX[i][j] + 1);
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                if (matrizA[i][j] == matrizB[i][j]) {
                    igual = igual + 1;
                } else {
                    diferentes = diferentes + 1;
                }
            }
        }
        if (diferentes > 0) {
            System.out.printf("La identidad algebraica no se cumple, ya que hay "
                    + "%s posicion/es done los valores son diferentes\n",
                    diferentes);
        } else {
            System.out.println("La identidad algebraica se cumple, ya que todos "
                    + "los valores coinciden");
        }
    }
}
