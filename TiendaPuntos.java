/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapuntos;

import java.util.Scanner;
import java.util.Random;

public class TiendaPuntos {

    public static void main(String[] args) {

        int compra, totalCompra = 0, cantCompra = 0, ptsTotal = 0, puntos;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Cantidad de compra?");
            compra = entrada.nextInt();

            totalCompra = totalCompra + compra;
            System.out.println("Total: " + totalCompra);//

            int random = (int) (Math.random() * 200 + 100);
            
            if (compra != 0) {

                cantCompra++;
                System.out.println(cantCompra + " compra(s)");//

            }

            if (compra <= 10000) {


                if ((random <= 100) && (random < 200)) {
                    puntos = compra / 100;
                    System.out.println(puntos + " puntos");
                    
                    ptsTotal += puntos;
                    System.out.println(ptsTotal + " puntos acumulados");
                }    
                    
                if ((random <= 200) && (random < 300)) {
                        puntos = compra / 50;
                        System.out.println(puntos + " puntos");
                        
                        ptsTotal += puntos;
                        System.out.println(ptsTotal + " puntos acumulados");
                } 
                
            } else if (compra >= 10000) {

                    int random = (int) (Math.random() * 100 + 200);

                    if ((random <= 100) && (random < 200)) {
                        puntos = compra / 50;
                        System.out.println(puntos + " puntos");
                        
                        ptsTotal += puntos;
                        System.out.println(ptsTotal + " puntos acumulados");
                   
                    }
                }
                
        } while (compra != 0);
        
        System.out.println("Total de la compra: $" + totalCompra);
       
    }

}
