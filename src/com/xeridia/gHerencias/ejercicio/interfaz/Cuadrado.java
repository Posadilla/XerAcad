package com.xeridia.gHerencias.ejercicio.interfaz;

public class Cuadrado implements Poligono{
    int nLados;
    double longLados;

    Cuadrado (int nLados, double longLados){
        this.nLados = nLados;
        this.longLados = longLados;

    }



    @Override
    public double getArea(double longLados){
        double area =(longLados*longLados);
        return area;
    }
}
