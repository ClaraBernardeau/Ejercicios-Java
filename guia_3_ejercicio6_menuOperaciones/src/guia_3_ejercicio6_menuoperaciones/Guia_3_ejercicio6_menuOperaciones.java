/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicio6_menuoperaciones;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicio6_menuOperaciones {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una
     * opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número (entero positivo)");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número (entero positivo)");
        int num2 = leer.nextInt();

        int opcion;

        do {
            System.out.println("MENU" + ("\n") + "1- Sumar" + ("\n") + "2- Restar" + ("\n") + "3- Multiplicar" + ("\n") + "4- Dividir" + ("\n") + "5- Salir" + ("\n") + "Por favor elija una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es igual a " + suma);
                    break;

                case 2:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " es igual a " + resta);
                    break;

                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("El resultado de la multiplicación de " + num1 + " * " + num2 + " es igual a " + multiplicacion);
                    break;

                case 4:
                    if (num2 != 0) {
                        int division = num1 / num2;
                        System.out.println("El resultado de la división de " + num1 + " / " + num2 + " es igual a " + division);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar el menú de operaciones :)");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor elija una opción válida");
                    break;

            }

        } while (opcion != 5);
    }
}
