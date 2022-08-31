package com.xeridia.fObjetos.ejercicios;

import com.xeridia.utils.Teclado;

public class MainFecha {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce los datos de las personas que deseas comparar: ");
        System.out.println("Introduce el nombre: ");
        String nombre1 = Teclado.readString();
        System.out.println("Introduce el día de nacimiento: ");
        System.out.println("Introduce el día: ");
        int dia1 = Teclado.readInteger();
        System.out.println("Introduce el mes: ");
        int mes1 = Teclado.readInteger();
        System.out.println("Introduce el año: ");
        int ano1 = Teclado.readInteger();
        System.out.println("Introduce una hora: ");
        int hora1 = Teclado.readInteger();
        System.out.println("Introduce los minutos: ");
        int minuto1 = Teclado.readInteger();
        System.out.println("Introduce los segundos: ");
        int segundo1 = Teclado.readInteger();
        System.out.println("¿Tiene empleo?");
        String estaEmpleado1 = Teclado.readString();
        boolean tieneEmpleo1 = estaEmpleado1.equals("si");

        System.out.println("Por favor, introduce los datos de la otra persona que deseas comparar: ");
        System.out.println("Introduce el nombre: ");
        String nombre2 = Teclado.readString();
        System.out.println("Introduce el día de nacimiento: ");
        System.out.println("Introduce el día: ");
        int dia2 = Teclado.readInteger();
        System.out.println("Introduce el mes: ");
        int mes2 = Teclado.readInteger();
        System.out.println("Introduce el año: ");
        int ano2 = Teclado.readInteger();
        System.out.println("Introduce una hora: ");
        int hora2 = Teclado.readInteger();
        System.out.println("Introduce los minutos: ");
        int minuto2 = Teclado.readInteger();
        System.out.println("Introduce los segundos: ");
        int segundo2 = Teclado.readInteger();
        System.out.println("¿Tiene empleo?");
        String estaEmpleado2 = Teclado.readString();
        boolean tieneEmpleo2 = estaEmpleado2.equals("si");


        Fecha fechaNacim1 = new Fecha(dia1, mes1, ano1, hora1, minuto1, segundo1);
        Fecha fechaNacim2 = new Fecha(dia2, mes2, ano2, hora2, minuto2, segundo2);

        Persona persona1 = new Persona(nombre1, tieneEmpleo1, fechaNacim1);
        Persona persona2 = new Persona(nombre2, tieneEmpleo2, fechaNacim2);
        boolean person1mayor;
        person1mayor = fechaNacim1.menorQue(fechaNacim2);
        System.out.println("¿Es  " + persona1.getNombre()+ " mayor que "+ persona2.getNombre()+ "?\n"+person1mayor);
    }

}
