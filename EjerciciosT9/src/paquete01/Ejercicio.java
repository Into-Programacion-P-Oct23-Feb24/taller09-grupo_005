/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite;

        System.out.println("Digite el numero de marcas que desea ingresar");
        limite = entrada.nextInt();
        entrada.nextLine();
        String[] marcas = new String[limite];

        int i = 0;
        String finalString = "";
        String inicial;
        String marca;

        while (i < limite) {
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();

            inicial = marca.substring(0, 1);
            inicial = inicial.toLowerCase();

            if (inicial.equals("a")
                    || inicial.equals("c")
                    || inicial.equals("t")) {
                System.out.println("Error: Inicial de marca invalida");
            } else {
                marcas[i] = marca;
                i++;
            }
        }

        for (int j = 0; j < marcas.length; j++) {

            System.out.println(marcas[j]);

        }

    }
}
