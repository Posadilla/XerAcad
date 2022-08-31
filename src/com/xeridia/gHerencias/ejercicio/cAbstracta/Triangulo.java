package com.xeridia.gHerencias.ejercicio.cAbstracta;

public class Triangulo extends Poligono{

    public Triangulo ( double longLados){
        super(longLados);
    }
    @Override
    public double getArea(double longLado){
        double area =(longLado*longLado)/2;
        return area;
    }



}
