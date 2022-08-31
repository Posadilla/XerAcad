package com.xeridia.fObjetos.ejercicios;

public class Persona {
    private String nombre;
    private boolean estaEmpleado;
    private Fecha fechaNacimiento;







    public Persona(String nombre, boolean estaEmpleado, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.estaEmpleado = estaEmpleado;
        this.fechaNacimiento= fechaNacimiento;
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


    public boolean isEstaEmpleado() {
        return estaEmpleado;
    }

    public void setEstaEmpleado(boolean estaEmpleado) {
        this.estaEmpleado = estaEmpleado;
    }

}
