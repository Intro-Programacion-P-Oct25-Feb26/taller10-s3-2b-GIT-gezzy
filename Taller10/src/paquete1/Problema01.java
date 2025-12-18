/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}};
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int dias[] = new int[5];
        int i;
        int j;
        int contador;
        String reporte = "";
        for (i = 0; i < asistencia.length; i++) {
            contador = 0;
            for (j = 0; j < 5; j++) {
                if (asistencia[i][j] == true) {
                    contador = contador + 1;
                }
                dias[i] = contador;
            }
            if (contador == 5) {
                reporte = String.format("%sEstudiante %s ha asistido un "
                        + "total de %s dias (Asistencia Completa)\n",
                        reporte, estudiantes[i], dias[i]);
            } else {
                reporte = String.format("%sEstudiante %s ha asistido un "
                        + "total de %s dias\n",
                        reporte, estudiantes[i], dias[i]);
            }
        }
        System.out.printf("%s\n", reporte);
    }
}
