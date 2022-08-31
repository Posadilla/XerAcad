package com.xeridia.dEstructurasCondicionales;

import com.xeridia.utils.Teclado;

public class Teoria {
    public static void main(String[] args) {
//        String input = Teclado.readString();
//        System.out.println(input);
//        int unidadesDisponibles = Teclado.readInteger();
//        String articulo;
//        if (unidadesDisponibles >= 0) {
//            System.out.println("Buscando el articulo: ");
//            if (unidadesDisponibles == 0) {
//                System.out.println("Existencias agotadas");
//            } else if ((unidadesDisponibles >= 0) && unidadesDisponibles <= 5) {
//                System.out.println("Solo quedan " + unidadesDisponibles + " unidades disponibles");
//            } else {
//                System.out.println("Existen " + unidadesDisponibles + " unidades disponibles");
//            }
//        }else {
//            System.out.println("Numero invalido zoquete. \n");
//        }


        String animal = "tigre";
        switch (animal){
            case "tigre":
            case "gato":
                System.out.println("miau");
                break;
            case "vaca":
                System.out.println("miau");
                break;
            case "perro":
                System.out.println("guau");
                break;
            default:
                System.out.println("El animal no esta contemplado");
        }

    }
}
