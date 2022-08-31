package com.xeridia.fObjetos.teoria;

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
        System.out.println(yo.hashCode());
        emp1.borrarempleado("Pepe");
        System.out.println(emp1);
        System.out.println(yo.hashCode());
        emp1.buscarEmpleado("Aaron");
        System.out.println(yo.hashCode());

//        Persona nuevo = emp1.buscarEmpleado("Aaron");
//        System.out.println(nuevo.hashCode());
        emp1.buscarEmpleado("Jose").setNombre("Joselito");
        System.out.println(yo.hashCode());

//        emp1.cambiarNombre(emp1.obtenerPosEmpleado(num3),"Joselito");
        System.out.println(emp1);
        System.out.println(yo.hashCode());
    }
}