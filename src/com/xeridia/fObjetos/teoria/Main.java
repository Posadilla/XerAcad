package com.xeridia.fObjetos.teoria;

public class Main {
    public static void main(String[] args) {

        Persona num1 = new Persona( "aaron",24, true);
        Persona num2 = new Persona("yago", 23, true);



        Perro miPerro = new Perro("Labrador",12);
        System.out.println(miPerro.raza);
        miPerro.raza = "Husky";
        System.out.println(miPerro.raza + " "+ miPerro.getEdad());
        miPerro.ladrar();

        Persona yo = new Persona("Aarón", 24,true);
        Persona tu = new Persona("Ramón", 58,false);
        System.out.println(yo.getEdad()+yo.getNombre()+yo.isEstaEmpleado());
        yo.saludar();
        System.out.println(yo);
        System.out.println(Persona.getnPersonas());
    }
}
