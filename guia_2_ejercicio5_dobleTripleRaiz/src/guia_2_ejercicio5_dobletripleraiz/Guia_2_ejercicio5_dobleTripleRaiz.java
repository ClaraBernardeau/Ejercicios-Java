/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_ejercicio5_dobletripleraiz;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_2_ejercicio5_dobleTripleRaiz {

    /**Escribir un programa que lea un número entero por teclado y muestre por 
     * pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raizCuad = Math.sqrt((double)num);
        
        System.out.println("El doble del numero " + num + " es " + doble + ", el triple es " + triple + " y su raiz cuadrada es " + raizCuad);
    }
    
}
