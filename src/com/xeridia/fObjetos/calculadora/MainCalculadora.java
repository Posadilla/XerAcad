package com.xeridia.fObjetos.calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        /*
        Crear una clase calculadora que contenga métodos para realizar las siguientes funciones:
         - Suma
         - Multiplicación
         - División
         - Raíz cuadrada
         Tanto el método de resta como el de suma deberá estar sobreg¡cargadas para aceptar 2 o 3 parametros.
         */
        Calculadora c = new Calculadora();

        System.out.println(c.sumar(3,4));
        System.out.println(c.sumar(3,4,5));
        System.out.println(c.restar(80,5));
        System.out.println(c.restar(80,5,70));
        System.out.println(c.division(40,5));
        System.out.println(c.multipicacion(8,5));
        System.out.println(c.hypot(3,4));
        System.out.println(c.raiz(81));
        System.out.println(c.potencia(2,3));
        System.out.println(c.potencia(2,3,3));
    }
}
