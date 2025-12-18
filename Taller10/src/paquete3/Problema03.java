/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};
        int zonas[] = new int[4];
        int i;
        int j;
        int fallos;
        String reporte = "";
        for (i = 0; i < sensores.length; i++) {
            fallos = 0;
            for (j = 0; j < 6; j++) {
                if (sensores[i][j] == false) {
                    fallos = fallos + 1;
                }
                zonas[i] = fallos;
            }
            if (fallos == 0) {
                reporte = String.format("%sZona de seguridad %s funciona sin fallos\n",
                        reporte, i + 1);
            } else {
                reporte = String.format("%sZona de seguridad %s ha presentado "
                        + "un total de %s fallos\n",
                        reporte, i + 1, zonas[i]);
            }
        }
        System.out.printf("%s\n", reporte);
    }
}
