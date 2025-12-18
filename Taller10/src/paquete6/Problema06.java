/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int[5][6];
        int matrizB[][] = new int[5][6];
        int[][] productoArreglo = new int[5][6];
        int i;
        int j;
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz A:\n", i, j);
                matrizA[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz B:\n", i, j);
                matrizB[i][j] = entrada.nextInt();
            }
        }

        System.out.println("MATRIZ A:");
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.printf("%d\t", matrizA[fila][col]);
            }
            System.out.println("");

        }
        System.out.println("MATRIZ B:");
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.printf("%d\t", matrizB[fila][col]);
            }
            System.out.println("");
        }
        int valor1;
        int valor2;

        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                valor1 = matrizA[fila][col];
                valor2 = matrizB[fila][col];
                productoArreglo[fila][col] = valor1 * valor2;
            }
        }
        System.out.println("MATRIZ RESULTANTE:");
        for (int fila = 0; fila < productoArreglo.length; fila++) {
            for (int col = 0; col < productoArreglo[fila].length; col++) {
                System.out.printf("%d\t", productoArreglo[fila][col]);
            }
            System.out.println("");
        }
    }
}
