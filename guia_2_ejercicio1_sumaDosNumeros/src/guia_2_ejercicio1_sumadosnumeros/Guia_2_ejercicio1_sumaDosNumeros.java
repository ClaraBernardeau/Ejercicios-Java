/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_ejercicio1_sumadosnumeros;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_2_ejercicio1_sumaDosNumeros {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule
     * la suma de los dos. El programa deberá después mostrar el resultado de la
     * suma
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma + ".");
    }

}
