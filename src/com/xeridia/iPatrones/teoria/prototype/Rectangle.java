package com.xeridia.iPatrones.teoria.prototype;

public class Rectangle extends Shape {
    public double lado1;
    public double lado2;

    public Rectangle (int x, int y, double lado1, double lado2){
        super(x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangle(Rectangle target) {
        super(target.x, target.y);
        this.lado1 = target.lado1;
        this.lado2 = target.lado2;
    }

    @Override
    public void draw() {
        System.out.println("Se ha dibujado el rectangulo.");
    }


    @Override
    public Shape clone() {
        return new Rectangle(this);

    }




}
