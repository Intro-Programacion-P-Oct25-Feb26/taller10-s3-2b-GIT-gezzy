/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author jdavi
 */
public class Problema08 {

    public static void main(String[] args) {
        int[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        int[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        int[][] resultado = new int[2][3];
        /*
            1   1   2
            6   8   1
         */
        int i;
        int j;
        int valor;
        for (i = 0; i < resultado.length; i++) {
            for (j = 0; j < 3; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    valor = dato1[i][j];
                    resultado[i][j] = valor;
                } else {
                    if (dato2[i][j] < dato1[i][j]) {
                        valor = dato2[i][j];
                        resultado[i][j] = valor;
                    }
                }

            }
        }
        for (i = 0; i < resultado.length; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%s\t", resultado[i][j]);
            }
            System.out.println("");
        }
    }
}
