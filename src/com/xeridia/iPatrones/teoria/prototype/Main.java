package com.xeridia.iPatrones.teoria.prototype;

public class Main {
    public static void main(String[] args) {
        Square squirtle = new Square(0,0,2);
        Shape wartotle = squirtle.clone();

        wartotle.draw();
        System.out.println(squirtle);
        System.out.println(wartotle);
    }
}
