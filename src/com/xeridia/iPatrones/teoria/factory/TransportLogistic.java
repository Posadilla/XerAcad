package com.xeridia.iPatrones.teoria.factory;

import com.xeridia.utils.Teclado;

public class TransportLogistic {


    public Transport createLogistic(){
        String name;
        do {
            name = Teclado.readString().toLowerCase();
            if (name.equals("road")){
                Transport truck = new Truck();
                return truck;
            }else if (name.equals("sea")){
                Transport ship = new Ship();
                return ship;
            }else {
                System.out.println("error de introducción de datos, por favor vuelva introducirlos.");
                return null;
            }
        }while (name.equals(null));
    }


}
