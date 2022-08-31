package com.xeridia.fObjetos.teoria;

public class Perro {
    public String raza;
    private int edad;

    public Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public void ladrar(){
        System.out.println("Guau!");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
