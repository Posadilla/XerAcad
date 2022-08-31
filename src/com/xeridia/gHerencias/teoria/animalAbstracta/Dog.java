package com.xeridia.gHerencias.teoria.animalAbstracta;

public class Dog extends Animal{
    private String race;


    public Dog(String name, int nPaws, String race){
        super(name,nPaws);
        this.race = race;
    }

    public void animalSound(){
        System.out.println("Guau");
    }

    @Override
    public void sound() {

    }

    public void showName(){
        System.out.println(this.name);
    }

}
