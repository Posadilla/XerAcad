package com.xeridia.hEstructurasDatos.teoria.list.linkedList;

import java.util.LinkedList;

public class Empresa {

    private final LinkedList<Persona> empleados;

    private String nombre;


    public Empresa(String  nombre){
        this.nombre = nombre;
        empleados = new LinkedList<>();
    }


    public boolean addEmployee(Persona persona){
        return this.empleados.add(persona);
    }


    public boolean addEmployee(String name,int edad, boolean esEmpleado, int cuentaancaria){
        return this.addEmployee(new Persona(name, edad, esEmpleado, cuentaancaria));
    }


    public Persona buscarEmpleado (Persona persona){
        return this.empleados.get(this.empleados.indexOf(persona));
    }
    public boolean borrarEmpleado(String name){
        return this.borrarEmpleado(new Persona(name, 0,false, 0));
    }
    public boolean borrarEmpleado(Persona persona){
        return this.empleados.remove(persona);
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
