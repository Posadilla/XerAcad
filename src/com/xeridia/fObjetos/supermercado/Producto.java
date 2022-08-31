package com.xeridia.fObjetos.supermercado;

public class Producto {
    private int amount;
    private String name;
    private double price;

    public Producto (String name, int amount, double price){
        this.name =name;
        this.amount = amount;
        this.price = price;
    }





    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
