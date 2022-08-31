package com.xeridia.gHerencias.ejercicio.cAbstracta;

public class Cuadrado extends Poligono{


    public Cuadrado ( double longLados){
        super(longLados);

    }


    @Override
    public double getArea(double longLado){
        double area =(longLado*longLado);
        return area;
    }

}
