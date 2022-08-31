package com.xeridia.hEstructurasDatos.teoria.list.linkedList;



public class MainEmpresa {
    public static void main(String[] args) {
        Persona num1 = new Persona( "Aaron",24, true);
        Persona num2 = new Persona("Pepe", 23, true);
        Persona num3 = new Persona("Jose", 23, true);
        Persona yo = new Persona("Aarito", 23, true);


        Empresa emp1 = new Empresa("Caca");
        emp1.addEmployee(num1);
        emp1.addEmployee(num2);
        emp1.addEmployee(num3);
        emp1.addEmployee(yo);

        emp1.borrarEmpleado("Pepe");
        System.out.println(emp1);
        emp1.buscarEmpleado(num1);


//        Persona nuevo = emp1.buscarEmpleado("Aaron");
//        System.out.println(nuevo.hashCode());
        emp1.buscarEmpleado(yo).setNombre("Joselito");


//        emp1.cambiarNombre(emp1.obtenerPosEmpleado(num3),"Joselito");
        System.out.println(emp1);
    }
}