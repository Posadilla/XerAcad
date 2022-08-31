package com.xeridia.iPatrones.teoria.prototype;

public class Circle extends Shape {
    public double r;


    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Circle target) {
        super(target.x, target.y);
        this.r = target.r;
    }

    @Override
    public void draw() {
        System.out.println("Se ha dibujado el círculo.");
    }

    @Override
    public Shape clone() {
        return new Circle( this);

    }
}
