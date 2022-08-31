package com.xeridia.gHerencias.ejercicio.cAbstracta;

public class Pentagono extends Poligono{


    public Pentagono( double longLados) {
        super(longLados);

    }

    @Override
    public double getArea(double longLado){
        double apotema = longLado/(2*Math.tan(0.628319));
        double area =5*longLado*apotema/2;
        return area;
    }


}
