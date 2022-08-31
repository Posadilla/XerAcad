package com.xeridia.gHerencias.ejercicio.interfaz;

public class MainInterfaz {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(3,4);
        Cuadrado cuadrado =  new Cuadrado(4,4);
        Pentagono pentagono = new Pentagono(5,4);

        System.out.println("Las respectivas areas son:");
        System.out.println("El área del triangulo es de: " + triangulo.getArea(triangulo.longLados));
        System.out.println("El área del cuadrado es de: " + cuadrado.getArea(cuadrado.longLados));
        System.out.println("El área del pentagono es de: " + pentagono.getArea(pentagono.longLados));
    }
}
