package com.xeridia.iPatrones.teoria.singleton;

public class Main {
    public static void main(String[] args) {

        Bdd bdd = Bdd.getInstance(8080);
        System.out.println(bdd);
        Bdd bdd2 = Bdd.getInstance(9090);
        System.out.println(bdd2);


        System.out.println(Bdd.getInstance(2020).connect());
        System.out.println(bdd2.connect());



    }
}
