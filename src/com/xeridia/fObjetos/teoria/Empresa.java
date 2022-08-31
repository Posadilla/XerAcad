package com.xeridia.fObjetos.teoria;

import java.util.Arrays;

public class Empresa {

    final int TRABAJADORES_MAX = 200;
    private Persona empleados[];
    private String nombre;


    public Empresa(String  nombre){
        this.nombre = nombre;
        empleados = new Persona[TRABAJADORES_MAX];
    }


    public boolean addEmployee(Persona persona){ //Añadir empleado//
        for (int i = 0; i < this.empleados.length; i++) {
            if (this.empleados[i] == null){
                this.empleados[i] =persona;
                return true;
            }
        }
        return false;
    }


    private int obtenerPosEmpleado (String nombre){
        for (int i = 0; i < this.empleados.length; i++) {
            if (this.empleados[i].getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

    public int obtenerPosEmpleado (Persona empleado){
        for (int i = 0; i < this.empleados.length; i++) {
            if (this.empleados[i].getNombre().equals(empleado.getNombre())){
                return i;
            }
        }
        return -1;
    }


    public Persona buscarEmpleado (String nombre){
        for (int i = 0; i < this.empleados.length; i++)
            if (this.empleados[i] != null && nombre.equals(this.empleados[i].getNombre())) {
                return this.empleados[i];
            }
        return null;
    }

    public boolean borrarempleado (String nombre){
        int pos = this.obtenerPosEmpleado(nombre);
        if (pos == -1){
            return false;
        }
        this.empleados[pos] =null;
        return true;
    }

    public void cambiarNombre(int pos,String nombre){
        this.empleados[pos].setNombre(nombre);
        return;
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("La empresa tiene un tamaño máximo de " + TRABAJADORES_MAX + "\n Lista de empleados \n");
        for (int i = 0; i < this.empleados.length; i++) {
            if (this.empleados[i] != null){
                output.append("\t-").append(this.empleados[i].getNombre()).append("\n");
            }
        }
        return output.toString();
    }

}
