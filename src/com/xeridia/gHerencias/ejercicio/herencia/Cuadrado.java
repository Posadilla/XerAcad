package com.xeridia.gHerencias.ejercicio.herencia;

public class Cuadrado extends Poligono{


    public Cuadrado (int nLados, double longLados){
        super(nLados,longLados);

    }


    @Override
    public double getArea(double longLado){
        double area =(longLado*longLado);
        return area;
    }
}


