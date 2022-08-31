package com.xeridia.fObjetos.supermercado;

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
    public int searchProduct (Producto product){
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
        StringBuilder output = new StringBuilder("El supermercado cuenta con un almacen, que cuenta con una cantidad total de " + almacen.getMAX_PRODS() + " y los siguientes productos: \n");
        for (int i = 0; i < this.almacen.getProducts().length; i++) {
            if (this.almacen.getProducts()[i] != null){
                output.append("\n\t-").append(this.almacen.getProducts()[i].getName())
                        .append(", precio: ").append(this.almacen.getProducts()[i].getPrice())
                        .append(", cantidad: ").append(this.almacen.getProducts()[i].getAmount());
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
