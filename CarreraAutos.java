/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

/**
 *
 * @author rdt
 */
public class CarreraAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pista track = new Pista();

        Auto auto1 = new Auto("/Users/rdt/NetBeansProjects/CarreraAutos/images/car1.png");
        Auto auto2 = new Auto("/Users/rdt/NetBeansProjects/CarreraAutos/images/car1.png");
        Auto auto3 = new Auto("/Users/rdt/NetBeansProjects/CarreraAutos/images/car1.png");
        Auto auto4 = new Auto("/Users/rdt/NetBeansProjects/CarreraAutos/images/car1.png");

        auto1.setVelocidad((int) ((Math.random() * 10) + 5));
        auto2.setVelocidad((int) ((Math.random() * 10) + 5));
        auto3.setVelocidad((int) ((Math.random() * 10) + 5));
        auto4.setVelocidad((int) ((Math.random() * 10) + 5));

        track.add(auto1);
        track.add(auto2);
        track.add(auto3);
        track.add(auto4);

        track.start();
    }

    public void hola() {
        int n = 10;

        // initialize to random values between 0 and 1
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
        }

        // print array values, one per line
        System.out.println("a[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("a = " + a);
        System.out.println();

        // find the maximum
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max = " + max);

        // average
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("average = " + sum / n);

        // copy to another array
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        // reverse the order
        for (int i = 0; i < n / 2; i++) {
            double temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }

        // print array values, one per line
        System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
        System.out.println();

        // dot product of a[] and b[]
        double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            dotProduct += a[i] * b[i];
        }
        System.out.println("dot product of a[] and b[] = " + dotProduct);
    }

}
