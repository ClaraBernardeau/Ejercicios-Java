/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejericicio1_parimpar;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejericicio1_parImpar {

    /**
     * Crear un programa que dado un número determine si es par o impar.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char continuar;

        do {
            System.out.println("Ingrese un número para saber si es par o impar");
            int num = leer.nextInt();

            if (num % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
            System.out.println("Desea ingresar otro número? S/N");
            continuar = leer.next().charAt(0);
        } while (continuar == ('s') || continuar == ('S'));

    }
}
