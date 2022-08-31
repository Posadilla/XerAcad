package com.xeridia.fObjetos.supermercado;

public class Almacen {
    private Producto products[];
    private int MAX_PRODS = 20;
    private String name;

    private int currentProducts;




    public Almacen (String name){
        this.name = name;
        products = new Producto[MAX_PRODS];
    }



    public boolean addProduct (Producto producto){
       if (countProduct() + producto.getAmount() <= MAX_PRODS) {
           if (searhProduct(producto) == -1) {

               for (int i = 0; i < this.products.length; i++) {
                   if (this.products[i] == null) {
                       this.products[i] = producto;
                       return true;
                   }
               }
           } else {
               this.products[searhProduct(producto)].setAmount(this.products[searhProduct(producto)].getAmount() + producto.getAmount());
           }
       }
        return false;
    }
    public int searhProduct ( Producto producto){
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] != null && this.products[i].getName().equals(producto.getName())){
                return i;
            }
        }
        return -1;
    }
    public boolean removeProduct (Producto producto){
        int position = searhProduct(producto);
        if (position == -1){
            return false;
        }
        this.products[position] = null;
        return true;
    }
    public boolean removeAmount (Producto product, int amount){
        if (searhProduct(product) != -1 && this.products[searhProduct(product)].getAmount() >= amount ){
            this.products[searhProduct(product)].setAmount(this.products[searhProduct(product)].getAmount()-amount);
            return true;
        } else if (searhProduct(product) != -1 && this.products[searhProduct(product)].getAmount() == amount){
            this.products[searhProduct(product)] = null;
            return true;
        } else {
            return false;
        }
    }
    public int countProduct(){
        int cantidad = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] != null){
                cantidad += this.products[i].getAmount();
            }
        }
        return cantidad;
    }




    public Producto[] getProducts() {
        return products;
    }

    public void setProducts(Producto[] products) {
        this.products = products;
    }

    public int getMAX_PRODS() {
        return MAX_PRODS;
    }

    public void setMAX_PRODS(int MAX_PRODS) {
        this.MAX_PRODS = MAX_PRODS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCurrentProducts() {
        return currentProducts;
    }

    public void setCurrentProducts(int currentProducts) {
        this.currentProducts = currentProducts;
    }
}
