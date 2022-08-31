package com.xeridia.gHerencias.ejercicio.herencia;

public class Triangulo extends Poligono{


    public Triangulo (int nLados, double longLados){
        super( nLados,longLados);
    }
    @Override
    public double getArea(double longLado){
        double area =(longLado*longLado)/2;
        return area;
    }

}
