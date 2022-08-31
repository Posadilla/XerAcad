package com.xeridia.dEstructurasCondicionales;

import com.xeridia.utils.Teclado;

public class Ejercicio {
    public static void main(String[] args) {
        {        /*
    Crear las siguientes variables para un pedido de un café.
        - El tipo de cafe
        - El numero de cafes
        - El precio individual
        - Si es o no para llevar
        - Si hay que poner bandeja de carton o no
        - En caso de que haya que poner bandeja, de que tamaño (2, 4, 8)
    Como maximo se pueden pedir 8 cafes, si se pide solo un cafe, no hay bandeja
    Una vez creada las variables, mostrar por consola la siguiente informacion:
        - El tipo de cafe
        - Cuantas tazas se han pedido
        - El precio total (tazas * precio)
        - Si es o no para llevar, en caso de que sea para llevar y sean mas de 1 cafe, poner el tamaño de la bandeja, si es solo 1 cafe, indicar que no lleva bandeja
*/
        }
        System.out.print("Introduce el tipo de cafe: ");
        String tipoCafe = Teclado.readString();
        System.out.print("\n¿Es para llevar? ");
        System.out.print("\nEscribe si o no, en función de si lo quieres para llevar o no: ");
        String esParaLlevar = Teclado.readString();
        int tamanoBandeja = 0;
        boolean paraLlevar = esParaLlevar.equals("si");
        System.out.print("\nIntroduce el número de cafes: ");
        int numeroCafes = Teclado.readInteger();
        if ((numeroCafes < 0 || numeroCafes > 8) && paraLlevar) {
            System.out.print("Como máximo 8 y mínimo 1");
            System.exit(0);
        } else if (numeroCafes > 0) System.out.println("Número correcto de cafes. :)");
        else {
            System.exit(0);
        }
        System.out.print("\nIntroduce el precio de cada cafe: ");
        double preciocafe = Teclado.readDouble();
        if (paraLlevar && numeroCafes != 1) {
            if (numeroCafes == 2) {
                tamanoBandeja = 2;
            } else if (4 >= numeroCafes) tamanoBandeja = 4;
            else tamanoBandeja = 8;
        } else {
            System.out.println("No se necesita bandeja de cartón.");
        }
        double precioTotal = preciocafe * numeroCafes;
        System.out.println("Se han pedido " + numeroCafes + " cafes.");
        System.out.println("Se han pedido " + tipoCafe + "s.");
        System.out.println("El precio total es de: " + precioTotal + " (e).");
        if (paraLlevar) {
            System.out.println("Si es necesario utilizar bandeja de cartón, y tendrá un tamaño de: " + tamanoBandeja);
        }
        {    //        System.out.print("Introduce el tipo de cafe: ");
//        String tipoCafe = Teclado.readString();
//        System.out.print("\nIntroduce el número de cafes: ");
//        int numeroCafes = Teclado.readInteger();
//        System.out.print("\nIntroduce el precio de cada cafe: ");
//        double preciocafe = Teclado.readDouble();
//        System.out.print("\n¿Es para llevar? ");
//        boolean paraLlevar;
//        System.out.print("\nEscribe si o no, en función de si lo quieres para llevar o no: ");
//        String esParaLlevar = Teclado.readString();
//        int numbandejas=0;
//        int tamanoBandeja = 0;
//        int restoBandeja = 0;
//        if (esParaLlevar.equals("si")){
//            paraLlevar = true;
//        } else{
//            paraLlevar = false;
//        }
//        boolean bandejaCarton;
//        restoBandeja = numeroCafes % 8;
//        if (restoBandeja == 0){
//            numbandejas = numeroCafes / 8;
//        } else {
//            numbandejas = numeroCafes / 8;
//            if(restoBandeja != 1){
//                numbandejas++;
//            }
//        }
//        if (paraLlevar && restoBandeja != 1){
//            if (restoBandeja == 2){
//                tamanoBandeja = 2;
//            } else {
//                if (restoBandeja <= 4){
//                    tamanoBandeja = 4;
//                } else {
//                    tamanoBandeja = 8;
//                }
//            }
//        } else {
//            System.out.println("No se necesita bandeja de cartón.");
//        }
//        double precioTotal;
//        precioTotal = preciocafe * numeroCafes;
//        System.out.println("Se han pedido " + numeroCafes + " "+ tipoCafe +".");
//        System.out.println("Se han pedido " + tipoCafe + "s.");
//        System.out.println("El precio total es de: " + precioTotal + " (e).");
//        if (paraLlevar && numbandejas !=0){
//            System.out.println("Se utilizan "+ numbandejas + " bandejas.");
//            System.out.println("Y el tamaño de la última bandeja es de: "+ tamanoBandeja);
//        }           }
        }
    }
}