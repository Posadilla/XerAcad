package com.xeridia.jManejoExcepciones;

public class Main {
    public static void main(String[] args) {
//        int [] array ={1, 2, 3};
//        int a = 1;
//        try {
//            a = 2;
//            array [3]= 2;
//            a = 3;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("No se puede acceder a esa posición.");
//        } finally {
//            System.out.println("Continuamos con la ejecución");
//        }
//        System.out.println(a);
        try {
        System.out.println(checkAge(-1));
        } catch (AgeException e){
            throw new RuntimeException(e);
        }
    }

    public static boolean checkAge (int age) throws AgeException{
        if (age >= 0 && age < 16) {
            return true;
        } else if (age > 16 && age < 99) {
            return false;
        }else if (age < 0){
            throw new AgeException(1);
        } else {
            throw new AgeException(2);
        }


        }
    }
