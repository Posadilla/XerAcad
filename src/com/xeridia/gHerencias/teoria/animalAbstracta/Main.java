package com.xeridia.gHerencias.teoria.animalAbstracta;



public class Main {
    public static void main(String[] args) {
        Cat gato = new Cat("dsad",8);
        Dog perro = new Dog(gato.name,8, "ajjs");


        gato.acechar();
        gato.sleep();

    }
}
