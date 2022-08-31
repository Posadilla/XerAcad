package com.xeridia.hEstructurasDatos.teoria.list.arrayList;

import java.util.ArrayList;

public class Empresa {
        private final ArrayList<Persona> empleados;

    private String nombre;


    public Empresa(String  nombre){
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }


    public boolean addEmployee(Persona persona){
        return this.empleados.add(persona);
    }
    public boolean addEmployee(String name,int edad, boolean esEmpleado, int cuentaancaria){
        return this.addEmployee(new Persona(name, edad, esEmpleado, cuentaancaria));
    }
    public Persona buscarEmpleado (String name){
        return this.empleados.get(this.empleados.indexOf(new Persona(name,0,false,2)));
    }
    public Persona buscarEmpleado (Persona persona){//TODO Averiguar porque no funciona.
        return this.empleados.get(empleados.indexOf(persona));
    }
    public boolean borrarEmpleado(String name){
        return this.borrarEmpleado(new Persona(name));
    }
    public boolean borrarEmpleado(Persona persona){
        return this.empleados.remove(persona);
    }









}
