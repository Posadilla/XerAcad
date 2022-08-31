package com.xeridia.hEstructurasDatos.teoria.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mySet = new TreeSet<>();

        mySet.add("Spain");
        mySet.add("Uk");
        mySet.add("France");
        mySet.add("Germany");
        mySet.add("Italy");

        System.out.println(mySet);

        TreeSet<Persona> personSet= new TreeSet<>();
        personSet.add(new Persona("muriel",82,false,0));
        personSet.add(new Persona("Eustaquio",85,false,0));
        personSet.add(new Persona("Agallas",7,false,0));

        for (Persona p: personSet
             ) {
            System.out.println(p);

        }

    }
}
