package com.xeridia.hEstructurasDatos.teoria.set;

import com.sun.istack.internal.NotNull;

public class Persona implements Comparable{
    private String nombre;
    private int edad;
    private boolean estaEmpleado;

    private static int nPersonas=0;

    private int cuentaBancaria;




    public Persona(String name){
        this.nombre = name;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        if (getEdad() != persona.getEdad()) return false;
        if (isEstaEmpleado() != persona.isEstaEmpleado()) return false;
        if (cuentaBancaria != persona.cuentaBancaria) return false;
        return getNombre() != null ? getNombre().equals(persona.getNombre()) : persona.getNombre() == null;
    }

    public int compareTo(@NotNull Object o){
        return Integer.compare(this.edad,((Persona) o).getEdad());
    }


    @Override
    public int hashCode() {
        int result = getNombre() != null ? getNombre().hashCode() : 0;
        result = 31 * result + getEdad();
        result = 31 * result + (isEstaEmpleado() ? 1 : 0);
        result = 31 * result + cuentaBancaria;
        return result;
    }
}
