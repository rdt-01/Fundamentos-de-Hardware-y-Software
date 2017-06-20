/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaalternativas;

/**
 *
 * @author rdt
 */
import java.util.Scanner;

public class PruebaAlternativas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1, b = 2, c = 3, cont = 0;
        int[] correctas = new int[10];

        Nota notas = new Nota(correctas, cont, a, b, c);
        notas.altercorrectas();
        notas.respcorrectas();
        notas.resultado();
    }
}
