package com.xeridia.gHerencias.teoria.animalAbstracta;

public class Cat extends Felino{


    public Cat(String name,int nPaws) {
        super(name,nPaws);
    }




    @Override
    public void sound() {

    }

    @Override
    public void showName() {
        System.out.println("Misifu");
    }
}
