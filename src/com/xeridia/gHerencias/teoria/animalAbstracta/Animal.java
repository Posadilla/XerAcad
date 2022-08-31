package com.xeridia.gHerencias.teoria.animalAbstracta;

abstract class Animal {

    protected String name;
    protected int nPaws;

    public Animal(String name,int nPaws){
        this.name = name;
        this.nPaws = nPaws;
    }

    public abstract void sound();

    public abstract void showName();
    public void sleep(){
        System.out.println("El animla esta durmiendo.");
    }
}
