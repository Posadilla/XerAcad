package com.xeridia.hEstructurasDatos.ejercicios.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SplittableRandom;

public class Almacen {
    private ArrayList<Producto> products;
    private String name;
    private int currentProducts;




    public Almacen (String name){
        this.name = name;
        products = new ArrayList<>();
    }



    public boolean addProduct (Producto producto){
        if (this.products.contains(producto)) {
            for (Producto p : this.products) {
                p.setAmount(p.getAmount()+producto.getAmount());
                return true;
            }
        }else {
            return this.products.add(producto);
        }
        return false;
    }
    public boolean addProduct (String name, int amount, double price){
        return this.products.add(new Producto(name, amount, price));
    }




    public Producto searhProduct (Producto producto){
        return this.products.get(this.products.indexOf(producto));
    }
    public Producto searhProduct (String name){
        return this.searhProduct(new Producto(name));
    }



    public boolean removeProduct (Producto producto){
        return this.products.remove(producto);
    }
    public boolean removeProduct (String name){
        return this.removeProduct(new Producto(name));
    }




    public boolean removeAmount (Producto product, int amount){
        if (searhProduct(product) != null && searhProduct(product).getAmount() >= amount ){
            searhProduct(product).setAmount(searhProduct(product).getAmount()-amount);
            return true;
        } else if (searhProduct(product) != null && searhProduct(product).getAmount() == amount){
            removeProduct(product);
            return true;
        } else {
            return false;
        }
    }
    public int countProduct(){
        int cantidad = 0;
        for (Producto p : this.products) {
            if (p != null) {
                cantidad += p.getAmount();
            }
        }
        return cantidad;
    }


    @Override
    public String toString(){
        StringBuilder out = new StringBuilder("\nLista de productos:\n");

        Iterator<Producto> it = products.iterator();

        while (it.hasNext()){
            out.append("\t- ").append(it.next()).append("\n");
        }
        System.out.println(out);
        return null;
    }

    public ArrayList<Producto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Producto> products) {
        this.products = products;
    }
}
