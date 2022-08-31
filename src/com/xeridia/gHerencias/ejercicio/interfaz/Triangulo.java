package com.xeridia.gHerencias.ejercicio.interfaz;

public class Triangulo implements Poligono{
    int nLados;
    double longLados;

    Triangulo (int nLados, double longLados){
        this.nLados = nLados;
        this.longLados = longLados;

    }

    @Override
    public double getArea(double longLados) {
        double area =(longLados*longLados)/2;
        return area;

    }
}
