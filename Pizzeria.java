/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int basesPizza, queso, jamon, tomate, champ, tipoPizza;
        int cantPizzaA, cantPizzaB, cantPizzaC, totalPizzaA = 0, totalPizzaB = 0, totalPizzaC = 0;
        int stockBases, stockQueso, stockJamon, stockTomate, stockChamp;
        int stock_finalBases, stock_finalQueso, stock_finalJamon, stock_finalTomate, stock_finalChamp;
        int nuevaOrden, ii = 1, iii = 1, i = 1, montoA = 0, montoB = 0, montoC = 0, montoTotal = 0;

        //ENTRADAS
        //Ingreso de stock inicial de ingredientes
        System.out.println(" - - - STOCK INICIAL DE INGREDIENTES - - -");

        //Bases de Pizza
        do {

            System.out.println("\nIngrese cantidad de bases de pizza (Cantidad debe ser entre 10 - 50 Unidades): ");
            basesPizza = entrada.nextInt();
            stockBases = basesPizza;

            if ((basesPizza < 10) || (basesPizza > 50)) {

                System.out.println("\nCantidad no válida, ingrese nuevamente");
            }

        } while ((basesPizza < 10) || (basesPizza > 50));

        //Queso
        do {

            System.out.println("\nIngrese cantidad de queso (Cantidad debe ser entre 10 - 20 Kgs): ");
            queso = entrada.nextInt();
            stockQueso = queso * 1000;

            if ((queso < 10) || (queso > 20)) {

                System.out.println("\nCantidad no válida, ingrese nuevamente");
            }

        } while ((queso < 10) || (queso > 20));

        //Jamón
        do {

            System.out.println("\nIngrese cantidad de jamón (Cantidad debe ser entre 5 - 10 Kgs): ");
            jamon = entrada.nextInt();
            stockJamon = jamon * 1000;

            if ((jamon < 5) || (jamon > 10)) {

                System.out.println("\nCantidad no válida, ingrese nuevamente");
            }

        } while ((jamon < 5) || (jamon > 10));

        //Tomate
        do {

            System.out.println("\nIngrese cantidad de tomate (Cantidad debe ser entre 10 - 15 Kgs): ");
            tomate = entrada.nextInt();
            stockTomate = tomate * 1000;

            if ((tomate < 10) || (tomate > 15)) {

                System.out.println("\nCantidad no válida, ingrese nuevamente");
            }

        } while ((tomate < 10) || (tomate > 15));

        //Champiñones
        do {

            System.out.println("\nIngrese cantidad de champiñones (Cantidad debe ser entre 5 - 10 Kgs): ");
            champ = entrada.nextInt();
            stockChamp = champ * 1000;

            if ((champ < 5) || (champ > 10)) {

                System.out.println("\nCantidad no válida, ingrese nuevamente");

            }

        } while ((champ < 5) || (champ > 10));

        //Ventas
        System.out.println("\n - - - VENTA - - - ");
        System.out.println("Bienvenido. ¿Qué desea llevar? (Ingrese el número de su orden)");
        
        
        System.out.println(" 1. Pizza A   -   2. Pizza B   -   3. Pizza C   - - -   4. Pagar  -  5. Cuadrar caja");
        System.out.println(" - Queso          - Queso          - Queso"
                + "\n - Tomate         - Tomate         - Jamón"
                + "\n - Jamón          - Champiñones    - Champiñones"
                + "\n $2500            $3000            $3500");

        do {

            tipoPizza = entrada.nextInt();

            if ((tipoPizza < 1) || (tipoPizza > 5)) {
                System.out.println("\nOrden no válida, ingrese nuevamente");
            }

        } while ((tipoPizza) < 1 || (tipoPizza > 5));

        switch (tipoPizza) {

            case 1:
                System.out.println("¿Cuántas pizzas de tipo A desea llevar?");
                cantPizzaA = entrada.nextInt();
                totalPizzaA = totalPizzaA + cantPizzaA;
                
                montoA = montoA + (cantPizzaA * 2500);

                stockBases = stockBases - cantPizzaA;
                stockQueso = stockQueso - 100;
                stockJamon = stockJamon - 100;
                stockTomate = stockTomate - 200;

                do {

                    System.out.println("¿Desea agregar otra orden?");
                    System.out.println(" 1. Sí   -   2. No ");
                    nuevaOrden = entrada.nextInt();

                    if ((nuevaOrden < 1) || (nuevaOrden > 2)) {
                        System.out.println("Opción no válida, ingrese nuevamente");
                    }

                    switch (nuevaOrden) {

                        case 1:

                        case 2:
                           
                    }

                } while ((nuevaOrden < 1) || (nuevaOrden > 2));

                break;

            case 2:
                System.out.println("¿Cuántas pizzas de tipo B desea llevar?");
                cantPizzaB = entrada.nextInt();
                totalPizzaB = totalPizzaB + cantPizzaB;
                stock_finalBases = stockBases - cantPizzaB;
                
                montoB = montoB + (cantPizzaB * 3000);

                stockBases = stockBases - cantPizzaB;
                stockQueso = stockQueso - 200;
                stockTomate = stockTomate - 200;
                stockChamp = stockChamp - 100;

                break;

            case 3:
                System.out.println("¿Cuántas pizzas de tipo C desea llevar?");
                cantPizzaC = entrada.nextInt();
                totalPizzaC = totalPizzaC + cantPizzaC;
                stock_finalBases = stockBases - cantPizzaC;
                
                montoC = montoC + (cantPizzaC * 3500);

                stockBases = stockBases - cantPizzaC;
                stockQueso = stockQueso - 200;
                stockJamon = stockJamon - 200;
                stockChamp = stockChamp - 200;

                break;
                
             case 4:
                 //Salir del ciclo para el reporte de cierre de caja

        }

        System.out.println(" - - - REPORTE CIERRE DE CAJA - - -");
        
        //Cantidad de pizzas vendidas, monto total
        int totalPizzas;
        totalPizzas = totalPizzaA + totalPizzaB + totalPizzaC;
        System.out.println("CANTIDAD DE PIZZAS VENDIDAS: "+totalPizzas+" ($"+montoTotal+")");
        //Cuantas pizzas tipo x se vendieron, monto por cada tipo
        System.out.println("DETALLE DE PIZZAS VENDIDAS: "+totalPizzaA+" pizzas de tipo A ($"+montoA+"), "+totalPizzaB+" pizzas de tipo B ($"+montoB+"),"
                + " "+totalPizzaC+" pizzas de tipo C ($"+montoC+").");
        //Cuanto ingrediente se vendio, mostrando el stock restante
        System.out.println("STOCK RESTANTE: "+stockBases+" bases, "+stockQueso+" queso,"+stockJamon+" jamon,"+stockTomate+" tomates,"+stockChamp+" champiñones.");
        //Utilidad del dia total. (Utilidad = ingresos - Costos)

    }

}
