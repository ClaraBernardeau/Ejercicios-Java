/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicio8_dibujarcuadrado;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicio8_dibujarCuadrado {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente: * * * * * * * *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos por lado que quiere que tenga el cuadrado");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i == 0 || i == cantidad - 1 || j == 0 || j == cantidad - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

}
