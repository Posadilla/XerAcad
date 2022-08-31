package com.xeridia.cOperadores;

public class Teoria {
    public static void main(String[] args) {
        int x = 5;
        x += 2;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);


        // OPERADORES booleanas

        boolean esRojo = false;
        boolean esGamaAlta = true;
        boolean esDeportivo = true;

        boolean esRojoYDeportivo= esRojo && esDeportivo;
        boolean esRojoODeportivo = esRojo || esDeportivo;
        boolean esGamaBaja = !esGamaAlta;

        System.out.println("Rojo y deportivo "+ esRojoYDeportivo);
        System.out.println("Rojo o deportivo "+ esRojoODeportivo);
        System.out.println("Es gama baja" + esGamaBaja);


        //OPERADORES DE COMPARACIÓN
        int edadJugador1 = 35;
        int edadJugador2 = 16;
        int puntosJugador1 = 5;
        int puntosJugador2 = 5;
        boolean esJ1MayorDeEdad = edadJugador1 >= 18;
        boolean esJ2MayorDeEdad = edadJugador2 >= 18;
        boolean tieneJ2LaEdadCorrecta = (edadJugador2 >= 10) && (edadJugador2 <= 99);
        boolean tieneDistintaEdad = edadJugador1 != edadJugador2;
        boolean hayEmpate = puntosJugador1 == puntosJugador2;

        System.out.println("Es el jugador 1 mayor de edad " + esJ1MayorDeEdad);
        System.out.println("Es el jugador 2 mayor de edad " + esJ2MayorDeEdad);
        System.out.println("Tiene el jugador 2 la edad correcta " + tieneJ2LaEdadCorrecta);
        System.out.println("Tiene diferente edad " + tieneDistintaEdad);
        System.out.println("Existe empate" + hayEmpate);


    }
}
