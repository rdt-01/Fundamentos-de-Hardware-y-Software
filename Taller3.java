/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

public class Taller3 {

    public static void main(String[] args) {

        //Entrada
        int horasTrab, diasTrab, semanas, horasExtra = 0, hExTotal = 0, horasTotal = 0;
        int pagoSem, pagoMens, ventas, ventasTotal = 0;
        double bonoVenta = 0, bonoVTotal = 0;

        Scanner entrada = new Scanner(System.in);

        //Proceso
        do {

            System.out.println("Ingrese cantidad de dias trabajados:");
            diasTrab = entrada.nextInt();
            semanas = diasTrab / 5;

            for (int i = 1; i <= semanas; i++) {

                System.out.println("Ingrese las horas trabajadas de la semana " + i + ":");
                horasTrab = entrada.nextInt();
                horasTotal = horasTotal + horasTrab;
                System.out.println("Horas totales mensuales: " + horasTotal);

                if (horasTrab > 40) {

                    horasExtra = horasTrab - 40;
                    System.out.println("Usted hizo " + horasExtra + " horas extras esta semana");//
                    System.out.println("");
                    hExTotal = hExTotal + horasExtra;

                } else {

                    System.out.println("Usted hizo 0 horas extras esta semana");
                    System.out.println("");
                }

                System.out.println("Ingrese el total de ventas de la semana " + i);
                ventas = entrada.nextInt();
                ventasTotal = ventasTotal + ventas;

                if (ventas > 300000) {

                    bonoVenta = ventas * 0.05;
                    bonoVTotal = bonoVTotal + bonoVenta;
                }

                if (ventas > 500000) {

                    bonoVenta = ventas * 0.10;
                    bonoVTotal = bonoVTotal + bonoVenta;
                }

                //SALIDA
                pagoSem = (horasTrab - horasExtra) * 2000 + (horasExtra * 3000) + (int) bonoVenta;
                System.out.println("Sueldo de la semana " + i + " del trabajador es: $" + pagoSem);
                System.out.println("");

            }

            //SALIDA
            pagoMens = (horasTotal - hExTotal) * 2000 + (hExTotal * 3000) + (int) bonoVTotal;
            System.out.println("Sueldo mensual del trabajador es: $" + pagoMens);

        } while ((diasTrab < 1) || (diasTrab > 30)); //Validacion, no puede trabajar menos de 1 dia
        //O mas de 30 dias mensuales;

    }

}