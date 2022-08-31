package com.xeridia.hEstructurasDatos.ejercicios.arrayList;

public class Producto {
    private int amount;
    private String name;
    private double price;

    public Producto (String name, int amount, double price){
        this.name =name;
        this.amount = amount;
        this.price = price;
    }
    public Producto (String name){
        this.name =name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;

        Producto producto = (Producto) o;

        if (getAmount() != producto.getAmount()) return false;
        if (Double.compare(producto.getPrice(), getPrice()) != 0) return false;
        return getName() != null ? getName().equals(producto.getName()) : producto.getName() == null;
    }

    @Override
    public int hashCode() {
        return 0;
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
