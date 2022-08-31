package com.xeridia.eBucles;

import com.xeridia.utils.Teclado;

public class Teoria {
    public static void main(String[] args) {
//        for (int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }
//        int pares=0;
//        int impares = 0;
//        for (int i = 0; i < 20 ;i++){
//            if (i%2 == 0){
//                pares++;
//            } else {
//                impares++;
//            }
//        }
//        System.out.println("Pares: "+ pares +"\nImpares: " + impares);
//
//        int nCompras = 0;
//        while (nCompras <= 10){
//            if (nCompras == 10){
//                System.out.println("Has llegado al limite de compras. ");
//            }
//            nCompras++;
//        }
//        do {
//            System.out.println(nCompras);
//            if (nCompras == 10){
//                System.out.println("Has llegado al limite de compras. ");
//            }
//            nCompras++;
//        }while (nCompras <= 10);
//
//        boolean salirse = false;
//        while (!salirse){
//            System.out.println("¿Quieres salir del sistema? (1=SI/0=NO)");
//            if (Teclado.readInteger() == 1){
//                break;
//            }
//            System.out.println("No se ha salido.");
//        }

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("¿Quieres saltarte un numero?: (0 / 1)");
            if (Teclado.readInteger() == 1){
                continue;
            }
            contador++;
        }
        System.out.println(contador);
    }
}
