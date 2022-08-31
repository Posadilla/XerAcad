package com.xeridia.hEstructurasDatos.teoria.map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


    HashMap<String,Capital> capitalCities = new HashMap<>();


    Capital leon = new Capital(170000,"León");
    Capital madrid = new Capital(3000000,"Madrid");
    Capital londres = new Capital( 9000000,"Londres");
    Capital paris = new Capital(9000000,"París");

    capitalCities.put("Spain",new Capital(3000000,"Madrid"));
    capitalCities.put("United Kingdom",new Capital(9000000,"Londres"));
    capitalCities.put("France",new Capital(9000000,"Paris"));

    System.out.println(capitalCities.get("Spain"));
    capitalCities.remove("United Kingdom");
    System.out.println(capitalCities+" " + capitalCities.size());
    capitalCities.clear();
    System.out.println(capitalCities);


    capitalCities.put("Spain",new Capital(3000000,"Madrid"));
    capitalCities.put("United Kingdom",new Capital(9000000,"Londres"));
    capitalCities.put("France",new Capital(9000000,"Paris"));


    StringBuilder out = new StringBuilder();
    for (String k: capitalCities.keySet()) {
        out.append("La capital de ").append(k).append(" es ").append(capitalCities.get(k).getName());
    }
    System.out.println(out);

     out = new StringBuilder();
    for (Capital v: capitalCities.values()) {
        out.append(v);
    }



    }
}
