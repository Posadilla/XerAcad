package com.xeridia.iPatrones.teoria.factory;

public class Truck implements Transport{







    @Override
    public void load() {
        System.out.println("El camión ha sido cargado con éxito.");
    }
    @Override
    public void deliver() {
        System.out.println("El camión esta en reparto.");
    }
}
