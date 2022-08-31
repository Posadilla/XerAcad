package com.xeridia.gHerencias.ejercicio.cAbstracta;

public abstract class Poligono {

    protected double longLados;

    Poligono( double longLados){
        this.longLados = longLados;
    }

    abstract double getArea(double longLados);
}
