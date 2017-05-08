/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarreglos;

import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args) {
        //Entrada de teclado
        Scanner entrada = new Scanner(System.in);
        //Variables
        int n = 0, i = 0, suma = 0;
        int min = 0;
        float prom = 0;

        System.out.println("Ingrese cantidad de notas: ");
        n = entrada.nextInt();
        //Se crea arreglo, con limite "n"(indefinido)
        int notas[] = new int[n];

        //Ciclo for
        for (i = 0; i < n; i++) {

            System.out.println("\nIngrese número para la posición " + i);
            notas[i] = entrada.nextInt();
            //se suman
            suma = suma + notas[i];

            //se calcula el promedio
            prom = (float) suma / n;

            System.out.println("\nEl promedio es: " + prom);

            // sdfsdfs
        }

        
        for (i = 0; i < n; i++) {
            if (i == 0) {
            
                min = notas[i]; //min = notas[0];
            }
                
            if (min > notas[i]) {
                min = notas[i];
            }

        }
        System.out.println("El menor es: " + min);

    }

}
