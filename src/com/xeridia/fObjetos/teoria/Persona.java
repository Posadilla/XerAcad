package com.xeridia.fObjetos.teoria;

public class Persona {
    private String nombre;
    private int edad;
    private boolean estaEmpleado;

    private static int nPersonas=0;

    private int cuentaBancaria;




    public Persona(String nombre, int edad, boolean estaEmpleado){
        this.nombre = nombre;
        this.edad = edad;
        this.estaEmpleado = estaEmpleado;
        nPersonas++;
    }

    public Persona(String nombre, int edad, boolean estaEmpleado, int cuentaBancaria) {
        this.nombre = nombre;
        this.edad = edad;
        this.estaEmpleado = estaEmpleado;
        this.cuentaBancaria = cuentaBancaria;
    }

    public void saludar(){
        System.out.println("Huuolaaaa!!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaEmpleado() {
        return estaEmpleado;
    }

    public void setEstaEmpleado(boolean estaEmpleado) {
        this.estaEmpleado = estaEmpleado;
    }

    @Override
    public String toString() {
        return "Nombre:'" + nombre + '\'' +
                ", edad: " + edad +
                ", estaEmpleado: " + estaEmpleado +
                '.';
    }

    public static int getnPersonas() {
        return nPersonas;
    }
}
