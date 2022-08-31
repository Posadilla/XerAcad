package com.xeridia.gHerencias.ejercicio.interfaz;

public class Pentagono implements Poligono{
    int nLados;
    double longLados;


    Pentagono (int nLados,double longLados){
        this.nLados = nLados;
        this.longLados = longLados;

    }

    @Override
    public double getArea(double longLado){
        double apotema = longLado/(2*Math.tan(0.628319));
        double area =5*longLado*apotema/2;
        return area;
    }

}
