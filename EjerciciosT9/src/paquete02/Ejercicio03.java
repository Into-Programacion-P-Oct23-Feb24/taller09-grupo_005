/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        int contadorArriba = 0;
        int contadorAbajo = 0;
        for (int i = 0; i < arreglo.length ; i++) {
            suma = suma + arreglo[i];
        }
        double promedio = suma / arreglo.length;
        for (int j = 0; j<arreglo.length; j++) {
            if (arreglo[j] > promedio) {
                contadorArriba++;
                
            } else {
                if (arreglo[j] < arreglo.length) {
                    contadorAbajo++;
                }
                
            }
        }
    
        System.out.printf("Promedio: %.4f\nElementos por encima: %d\n"
                + "Elementos por debajo: %d\n", 
                promedio,
                contadorArriba,
                contadorAbajo);

    }
    

}
