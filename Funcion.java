/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion;

import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {
        int num1, num2, resultado;
        System.out.println("Ingrese dos números");
        Scanner entrada = new Scanner(System.in);
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        resultado = suma(num1, num2); //LLamada a la función suma
        System.out.println("La suma de los números es " + resultado);
    }
    
    public static int suma(int n1, int n2){
        int result = n1 + n2;
        return result;
    
    }
    
}
