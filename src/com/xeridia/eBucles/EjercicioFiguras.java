package com.xeridia.eBucles;

public class EjercicioFiguras {
    public static void main(String[] args) {
        for (int i = 0; i <= 5;i++){
            for (int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n----------");

        for (int i = 5; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n----------");
        for (int i = 0; i <= 5;i++){
            if (i == 0 || i == 5){
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }
        }
        System.out.println("\n-----------");

        for (int i = 5; i >= 0; i--){
            for (int j = 0; j <= 5; j++){
                if (j < i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n-----------\n");

        int tam = 6;
        for (int i = 0; i <= tam;i++){
            for (int j =0; j <= tam; j++){
                if (i ==0 || i == tam){
                    System.out.print("*");
                } else {
                    if (j ==0 || j == tam){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
