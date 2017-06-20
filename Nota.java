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

public class Nota {
    public int correctas[];
    public int cont; 
    public int a;
    public int b;
    public int c;

    public Nota(int[] correctas, int cont, int a, int b, int c) {
        this.correctas = correctas;
        this.cont = cont;
        this.a = a;
        this.b = b;
        
        this.c = c;
    }

    public int[] getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int[] correctas) {
        this.correctas = correctas;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
        public void altercorrectas() {
        int i = 0;
        
        for (i = 0; i < 10; i++) {
           
            correctas[i] = (int) (Math.random() * 3)+1;
            System.out.println("CORRECTAS: "+correctas[i]);
            
           
        }
    }

    public void respcorrectas() {
        Scanner s = new Scanner(System.in);
        int i = 0, correctas1 = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("===================================================");
            do{       
            System.out.println("Ingrese un numero para la respuesta N° "+(i+1)+":");
            System.out.println("\n1: A \n2: B \n3: C");
            correctas1 = s.nextInt();
            if(correctas1<1 || correctas1>3){
                System.out.println("Ingrese los numeros de las respuestas por favor.");
            }
            }while(correctas1<1 || correctas1>3);
            
            if(correctas[i]==correctas1){
                cont = cont +1;
            }
            
            
            
        }
        
        cont = cont*10;
        
        
    }
    public void resultado(){
        double puntaje=0, nota=0;
        
        puntaje = cont;
        
        if(puntaje>=60){
            nota = (puntaje*0.06)+1;
        }if(puntaje<60){
            nota= (puntaje*0.05)+1;
        }
        
        System.out.println("La nota del alumno es un: "+nota);
        
    }
}
