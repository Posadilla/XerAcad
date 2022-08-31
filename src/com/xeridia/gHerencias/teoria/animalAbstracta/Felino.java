package com.xeridia.gHerencias.teoria.animalAbstracta;

public class Felino extends Animal{



    public Felino(String name, int nPaws) {
        super(name, nPaws);
    }

    public void acechar(){
        System.out.println("Te acecho");
    }
    @Override
    public void sound() {

    }
    @Override
    public void showName() {

    }
}
