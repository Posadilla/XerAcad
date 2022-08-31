package com.xeridia.gHerencias.ejercicio.herencia;

abstract class Poligono {

    protected int nLados;
    protected double longLados;
    protected double getArea;

    public Poligono (int nLados, double longLados){
        this.nLados = nLados;
        this.longLados = longLados;
    }

    public double getArea (double longLado){
        return 0;
    }


}
