/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicio2_eureka;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicio2_eureka {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una frase. Tiene " + (3 - i) + " intentos");

            String frase = leer.nextLine();

            if (frase.equals("eureka")) {
                System.out.println("Correcto!");
                break;
            } else {
                System.out.println("Incorrecto");
            }
        }
    }

}
