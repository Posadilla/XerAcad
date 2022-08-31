package com.xeridia.fObjetos.supermercado;

public class MainSupermercado {
    public static void main(String[] args) {
        /*
        El supermercado tiene un almacen
        El almacen tiene una lista de productos
        Los productos tienen nombre, precio y cantidad
         */
        Producto fresa = new Producto("Fresa",8, 2.5);
        Producto papelHiguienico = new Producto("Papel do culo", 2, 3);
        Supermercado mercadona = new Supermercado("mercadona");
        mercadona.addProduct(fresa);
        mercadona.addProduct(papelHiguienico);

        System.out.println();
        System.out.println(mercadona);
        System.out.println("\nCantidad total de productos: " + mercadona.getAlmacen().countProduct() + "\n");

        mercadona.removeProduct(fresa);

        System.out.println(mercadona);
        System.out.println("\nCantidad total de productos: " + mercadona.getAlmacen().countProduct() + "\n");


        mercadona.addProduct(fresa);


        System.out.println(mercadona);
        System.out.println("\nCantidad total de productos: " + mercadona.getAlmacen().countProduct() + "\n");


        mercadona.addProduct(fresa);
        mercadona.removeAmount(fresa, 10);
        mercadona.addProduct(fresa);
        mercadona.addProduct(fresa);

        System.out.println("\nCantidad total de productos: " + mercadona.getAlmacen().countProduct() + "\n");
        System.out.println(mercadona);
        System.out.println("\nCantidad total de productos: " + mercadona.getAlmacen().countProduct() + "\n");
    }
}
