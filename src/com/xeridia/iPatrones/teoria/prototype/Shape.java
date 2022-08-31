package com.xeridia.iPatrones.teoria.prototype;

public abstract class Shape {

    public int x;
    public int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Shape(Shape target){
        this.x = target.x;
        this.y = target.y;
    }

    void draw() {

    }

    public Shape clone() {
        return null;
    }
}
