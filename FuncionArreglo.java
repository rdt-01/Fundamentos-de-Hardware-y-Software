/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarreglo;

import java.util.Scanner;

public class FuncionArreglo {
    
    final static int N = 8; //cantidad de celdas para el arreglo
    
    public static void main(String[] args) {
        int[] numeros = new int[N];
        ingresar(numeros); //llamada a una funcion de tipo void
        muestra(numeros);
    }
    
    //funcion que permite ingresar los numeros en un arreglo
    //esta funcion no retorna nada por tanto es tipo void
    public static void ingresar(int[] x) {
        int i;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < N; i++) {
            System.out.println("Ingrese un numero para la celda " + i);
            x[i] = entrada.nextInt();
        
        }
    
    }
    
    //funcion que muestra el arreglo
    //no retorna resultado por tanto es de tipo void
    public static void muestra(int[] x) {
        int i;
        System.out.println("Numeros en el arreglo");
        for (i = 0; i < N; i++) {
            System.out.println("X[" + i + "] = " + x[i]);
        
        }
    
    }
    
}
