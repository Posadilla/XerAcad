package com.xeridia.iPatrones.teoria.factory;

public class Ship implements Transport{


    int MAX_Load;



    @Override
    public void load() {
        System.out.println("El barco ha sido cargado con éxito.");
    }
    @Override
    public void deliver(){
        System.out.println("El barco esta en reparto.");

    }
}
