/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};
        int[] familias = new int[3];
        int adultos;
        int menores;
        int i;
        int j;
        String reporte = "";
        for (i = 0; i < familias.length; i++) {
            adultos = 0;
            menores = 0;
            for (j = 0; j < 4; j++) {
                if (edades[i][j] >= 18) {
                    adultos = adultos + 1;
                } else {
                    menores = menores + 1;
                }
            }
            familias[i] = adultos;
            reporte = String.format("%sFamilia %s, tiene un total de %s adultos\n",
                    reporte, i + 1, familias[i]);
        }
        System.out.printf("%s\n", reporte);
    }
}
