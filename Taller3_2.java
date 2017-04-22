/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_2;

import java.util.Scanner;

public class Taller3_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int lanzar = 0;

        //Encabezado
        System.out.println("Alejandro está buscando una mesa para poder jugar StarCraft cómodamente.");
        System.out.println("Su trayecto es desde el departamento de Ciencias Jurídicas y Empresariales,");
        System.out.println("Hasta el departamento de Ingeniería de Computación e Informática.");
        System.out.println("Las posibilidades son los edificios: RA, R1, D, E y DIS.");
        System.out.println("Al pasar por cada uno de estos Alejandro lanzará una moneda.");
        System.out.println("Si sale cara, buscará una mesa en dicho edificio.");
        System.out.println("Si sale cruz, seguirá buscando.");
        System.out.println("");
        //Cara es 1, cruz es 2

        //RA
        System.out.println("Alejandro se encuentra en el edificio RA.");

        for (int i = 0; i < 1;) {

            do {

                System.out.println("Ingresa (1) para lanzar la moneda:");
                lanzar = entrada.nextInt();

                int monedaRA = (int) (Math.random() * 2) + 1;

                if (monedaRA == 1) {
                    System.out.println("Ha salido (cara)");
                    System.out.println("Por lo tanto, Alejandro buscará una mesa en el RA.");
                    i++;

                } else {

                    if (monedaRA == 2) {
                        System.out.println("Ha salido (cruz)");
                        System.out.println("Alejandro seguirá caminando...");
                        System.out.println(" . . . ");
                        System.out.println("Alejandro se encuentra en el eficio R1.");

                        do {

                            System.out.println("Ingresa (1) para lanzar la moneda:");
                            lanzar = entrada.nextInt();

                            int monedaR1 = (int) (Math.random() * 2) + 1;

                            if (monedaR1 == 1) {
                                System.out.println("Ha salido (cara)");
                                System.out.println("Por lo tanto, Alejandro buscará una mesa en el R1.");
                                i++;

                            } else {

                                if (monedaR1 == 2) {
                                    System.out.println("Ha salido (cruz)");
                                    System.out.println("Alejandro seguirá caminando...");
                                    System.out.println(" . . . ");
                                    System.out.println("Alejandro se encuentra en el edificio D.");

                                    do {

                                        System.out.println("Ingresa (1) para lanzar la moneda:");
                                        lanzar = entrada.nextInt();

                                        int monedaD = (int) (Math.random() * 2) + 1;

                                        if (monedaD == 1) {
                                            System.out.println("Ha salido (cara)");
                                            System.out.println("Por lo tanto, Alejandro buscará una mesa en el D.");
                                            i++;

                                        } else {

                                            if (monedaD == 2) {
                                                System.out.println("Ha salido (cruz)");
                                                System.out.println("Alejandro seguirá caminando...");
                                                System.out.println(" . . . ");
                                                System.out.println("Alejandro se encuentra en el edificio E.");

                                                do {

                                                    System.out.println("Ingresa (1) para lanzar la moneda:");
                                                    lanzar = entrada.nextInt();

                                                    int monedaE = (int) (Math.random() * 2) + 1;

                                                    if (monedaE == 1) {
                                                        System.out.println("Ha salido (cara)");
                                                        System.out.println("Por lo tanto, Alejandro buscará una mesa en el E.");
                                                        i++;

                                                    } else {

                                                        if (monedaE == 2) {
                                                            System.out.println("Ha salido (cruz)");
                                                            System.out.println("Alejandro seguirá caminando...");
                                                            System.out.println(" . . . ");
                                                            System.out.println("Alejandro se encuentra en el DIS.");

                                                            do {

                                                                System.out.println("Ingresa (1) para lanzar la moneda:");
                                                                lanzar = entrada.nextInt();

                                                                int moneda = (int) (Math.random() * 2) + 1;

                                                                if (moneda == 1) {
                                                                    System.out.println("Ha salido (cara)");
                                                                    System.out.println("Por lo tanto, Alejandro buscará una mesa en el DIS.");
                                                                    i++;

                                                                } else {

                                                                    if (moneda == 2) {
                                                                        System.out.println("Ha salido (cruz)");
                                                                        System.out.println("Por lo tanto, Alejandro hará todo el recorrido nuevamente.");
                                                                        System.out.println(" . . . ");
                                                                       
                                                                    }
                                                                }

                                                            } while (lanzar != 1);
                                                        }
                                                    }

                                                } while (lanzar != 1);
                                            }
                                        }

                                    } while (lanzar != 1);
                                }
                            }

                        } while (lanzar != 1);
                    }
                }

            } while (lanzar != 1);

        }

        System.out.println("");
        System.out.println("FIN");

    }

}
