/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int[3][2];
        int matrizB[][] = new int[3][2];
        int i;
        int j;
        int contadorMayorIgual = 0;
        int contadorMayores = 0;
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz A:\n", i, j);
                matrizA[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("Ingrese un valor para la posicion [%s][%s] "
                        + "de la Matriz B:\n", i, j);
                matrizB[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                if (matrizA[i][j] >= matrizB[i][j]) {
                    contadorMayorIgual = contadorMayorIgual + 1;
                }
                if (matrizA[i][j] > matrizB[i][j]) {
                    contadorMayores = contadorMayores + 1;
                }
            }
        }
        System.out.println("MATRIZ A:");
        System.out.println("-------------------------------");
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.printf("|\t%d\t|", matrizA[fila][col]);
            }
            System.out.println("");
            System.out.println("-------------------------------");
        }
        System.out.println("MATRIZ B:");
        System.out.println("-------------------------------");
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.printf("|\t%d\t|", matrizB[fila][col]);
            }
            System.out.println("");
            System.out.println("-------------------------------");
        }
        if (contadorMayorIgual > 0 && contadorMayores > 0) {
            System.out.println("RESULTADO: La Matriz A es Mayor a la Matriz B");
        } else {
            System.out.println("RESULTADO: La Matriz A no es Mayor a la Matriz B");
        }
    }
}
