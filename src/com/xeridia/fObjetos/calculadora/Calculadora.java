package com.xeridia.fObjetos.calculadora;

import static java.lang.Math.*;

public class Calculadora {


    public Calculadora (){
    }

    double sumar(double a, double b){
        return a + b ;
    }

    double sumar(double a, double b, double c){
        return a + b + c;
    }

    double restar(double a, double b){
        return a - b;
    }

     double restar(double a, double b, double c){
        return a - b - c;
    }

     double multipicacion( double a, double b){
        return a * b;
    }
     double division (double a, double b){
        return a/b;
    }
    double raiz (double a){
        return sqrt(a);
    }
    double hypot (double a, double b){
        return Math.hypot(a,b);
    }

    double potencia (double a, double b){
        return pow(a,b);
    }

    double potencia (double a, double b,double c){
        return pow(Math.pow(a,b),c);
    }
}
