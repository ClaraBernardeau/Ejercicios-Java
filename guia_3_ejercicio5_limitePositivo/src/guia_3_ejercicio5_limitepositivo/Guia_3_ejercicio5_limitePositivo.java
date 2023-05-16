/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicio5_limitepositivo;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicio5_limitePositivo {

    /**
     * Escriba un programa en el cual se ingrese un valor limite positivo, y a
     * continuacion solicite numeros al usuario hasta que la suma de los numeros
     * introducidos supere el limite inicial.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para ser el limite (el numero debe ser positivo)");

        int limite = leer.nextInt();
        int suma = 0;

        for (int i = 0; suma < limite; i++) {
            System.out.println("Ingrese un número");
            int numero = leer.nextInt();

            suma += numero;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }

}
