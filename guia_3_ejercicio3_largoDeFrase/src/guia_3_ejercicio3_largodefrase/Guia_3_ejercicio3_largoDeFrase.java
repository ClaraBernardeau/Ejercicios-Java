/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicio3_largodefrase;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicio3_largoDeFrase {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la funcion
     * Lenght() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una frase o palabra. Tiene " + (3 - i) + " intentos.");
            String frase = leer.nextLine();

            if (frase.length() == 8) {
                System.out.println("CORRECTO");
                break;
            } else {
                System.out.println("INCORRECTO");
            }
        }
    }

}
