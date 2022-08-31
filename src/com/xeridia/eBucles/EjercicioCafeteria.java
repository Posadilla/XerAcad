package com.xeridia.eBucles;

import com.xeridia.utils.Teclado;

public class EjercicioCafeteria {
    public static void main(String[] args) {
        int hacerPedido;
        do {
            System.out.println("¿Quieres hacer un pedido? (1 SI/ 0 NO) =)");
            hacerPedido = Teclado.readInteger();
            if(hacerPedido == 1) break;
        } while (hacerPedido != 0);
            do {
                System.out.println("Introduce el tipo de cafe: ");
                String tipoCafe = Teclado.readString();
                System.out.print("\n¿Es para llevar? ");
                boolean paraLlevar;
                System.out.print("\nEscribe si o no, en función de si lo quieres para llevar o no: ");
                String esParaLlevar = Teclado.readString();
                int tamanoBandeja = 0;
                paraLlevar = esParaLlevar.equals("si");
                System.out.print("\nIntroduce el número de cafes: ");
                int numeroCafes = Teclado.readInteger();
                if ((numeroCafes <0 || numeroCafes >8) && paraLlevar){
                    System.out.print("Como máximo 8 y mínimo 1");
                    System.exit(0);
                } else if (numeroCafes > 0){
                    System.out.println("Número correcto de cafes. :)");
                } else{
                    System.exit(0);
                }
                System.out.print("\nIntroduce el precio de cada cafe: ");
                double preciocafe = Teclado.readDouble();
                if (paraLlevar && numeroCafes != 1){
                    if (numeroCafes == 2){
                        tamanoBandeja = 2;
                    } else {
                        if (numeroCafes <= 4) tamanoBandeja = 4;
                        else tamanoBandeja = 8;
                    }
                } else System.out.println("No se necesita bandeja de cartón.");
                double precioTotal;
                precioTotal = preciocafe * numeroCafes;
                System.out.println("Se han pedido " + numeroCafes + " "+ tipoCafe +".");
                System.out.println("Se han pedido " + tipoCafe + "s.");
                System.out.println("El precio total es de: " + precioTotal + " (e).");
                if (paraLlevar){
                    System.out.println("El tamaño de la bandeja es de: "+ tamanoBandeja);
                }
                System.out.println("¿Deseas volver a hacer pedidos? (1 SI/ 0 NO) =)");
                hacerPedido = Teclado.readInteger();
            } while (hacerPedido == 1);
    }
}