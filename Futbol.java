/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.Scanner;

public class Futbol {

    public static void main(String[] args) {

        int goles1, goles2, total_gol=0, ptos1, ptos2, dif_gol, part_win1=0, part_win2=0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
                   
            //entrada numero de goles para 10 partidos
            System.out.println("\nPartido nº "+(i+1));
            System.out.println("Ingrese nº de goles del equipo 1:");
            goles1 = entrada.nextInt();
            System.out.println("Ingrese nº de goles del equipo 2:");
            goles2 = entrada.nextInt();
            System.out.println(" ");
            
            total_gol = total_gol + goles1;
            System.out.println("Total de goles "+total_gol);
            
            //Puntos
            ptos1 = goles1 * 3;
            ptos2 = goles2 * 3;
            System.out.println("Puntos equipo 1: "+ptos1);
            System.out.println("Puntos equipo 2: "+ptos2);
            
            //Partidos ganados o perdidos
            //Diferencia de goles
            if (goles1 > goles2){
                dif_gol = goles1 - goles2;
                part_win1++; 
            } else {
                dif_gol = goles2 - goles1;
                part_win2++;
            }
            System.out.println("Partidos ganados equipo 1: "+part_win1);
            System.out.println("Partidos ganados equipo 2: "+part_win2);
            System.out.println("Diferencia de goles: "+dif_gol);
        }
        
    }

}