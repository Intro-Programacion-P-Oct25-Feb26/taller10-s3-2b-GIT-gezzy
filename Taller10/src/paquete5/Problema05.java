/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        int i;
        int j;
        String reporte = "";
        String letra;
        for (i = 0; i < estudiantes.length; i++) {
            for (j = 0; j < 2; j++) {
                letra = estudiantes[i][j].substring(0, 1);
                if (letra.equals("S") || letra.equals("P") || letra.equals("T")) {
                    reporte = String.format("%s%s\n", reporte, estudiantes[i][j]);
                }
            }
        }
        System.out.printf("%s", reporte);
    }
}
