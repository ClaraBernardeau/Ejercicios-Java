/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_ejercicio3_mayusculasminusculas;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 *
 * @author berna
 */
public class Guia_2_ejercicio3_mayusculasMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        System.out.println("La frase ingresada, en mayúsculas se ve así: "
                + frase.toUpperCase() + " y en minusculas se ve así: " + frase.toLowerCase());

    }

}
