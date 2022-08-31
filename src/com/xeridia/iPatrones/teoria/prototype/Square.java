package com.xeridia.iPatrones.teoria.prototype;

public class Square extends Shape {
    double lado;

    public Square (int x, int y, double lado){
        super(x, y);
        this.lado = lado;
    }

    public Square(Square target){
        super(target.x, target.y);
        this.lado = target.lado;
    }

    @Override
    public void draw() {
        System.out.println("Se ha dibujado un cuadrado guapisimo");
    }

    @Override
    public Shape clone() {
        return new Square(this);

    }
}
