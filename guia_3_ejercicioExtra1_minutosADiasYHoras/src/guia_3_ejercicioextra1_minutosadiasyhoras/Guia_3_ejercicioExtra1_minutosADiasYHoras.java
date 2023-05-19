/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_ejercicioextra1_minutosadiasyhoras;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Guia_3_ejercicioExtra1_minutosADiasYHoras {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de tiempo en minutos");
        int minutos = leer.nextInt();

        int hora = minutos / 60;
        int dias = hora / 24;

        System.out.println(minutos + " minutos equivale a " + hora + " horas y " + dias + " días");
    }

}
