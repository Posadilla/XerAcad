package com.xeridia.hEstructurasDatos.ejercicios.arrayList;

public class Supermercado {
    public Almacen almacen;
    private String name;


    public Supermercado  (String name){
        this.name = name;

        this.almacen = new Almacen(name);
    }




    public boolean addProduct (Producto product){
        return this.almacen.addProduct(product);
    }

    public Producto searchProduct (Producto product){
        return this.almacen.searhProduct(product);
    }
    public boolean removeProduct (Producto product){
        return this.almacen.removeProduct(product);
    }
    public boolean removeAmount (Producto producto, int amount){
        return this.almacen.removeAmount(producto, amount);
    }
    public int countProducts (){
        return this.almacen.countProduct();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("El supermercado cuenta con un almacen, que cuenta con una cantidad total de " + almacen.countProduct() + " y los siguientes productos: \n");
        for (Producto p : this.almacen.getProducts()) {
            if (p != null){
                output.append("\n\t-").append(p.getName())
                        .append(", precio: ").append(p.getPrice())
                        .append(", cantidad: ").append(p.getAmount());
            }
        }
        return output.toString();
    }


    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
}
