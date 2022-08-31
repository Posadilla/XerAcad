package com.xeridia.dEstructurasCondicionales;

import com.xeridia.utils.Teclado;

public class EjercicioSwitch {
    public static void main(String[] args) {
        System.out.println("Dime un mes con número.");
        int mes = Teclado.readInteger();
        switch (mes){
            case 1:
            case 3:
            case 4:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes seleccionado tiene 31 días.");
                break;
            case 2:
                System.out.println("El mes seleccionado tiene 28 días.");
                break;
            case 5:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes seleccionado tiene 30 días.");
                break;
            default:
                System.out.println("El mes introducido no existe.");

        }
    }
}

