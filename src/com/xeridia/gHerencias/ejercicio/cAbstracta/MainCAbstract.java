package com.xeridia.gHerencias.ejercicio.cAbstracta;

public class MainCAbstract {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4);
        Cuadrado cuadrado = new Cuadrado(4);
        Pentagono pentagono = new Pentagono(5);


        System.out.println("El triangulo tiene un area de: " + triangulo.getArea(triangulo.longLados) + " unidades cuadradas.");
        System.out.println("El cuadrado tiene un area de: " + cuadrado.getArea(cuadrado.longLados) + " unidades cuadradas.");
        System.out.println("El pentagono tiene un area de: " + pentagono.getArea(pentagono.longLados) + " unidades cuadradas.");



    }
}
