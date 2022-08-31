package com.xeridia.fObjetos.ejercicios;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int segundo;

    public Fecha(int dia, int mes, int ano){
        this.ano =ano;
        this.mes = mes;
        this.dia = dia;
    }

    public Fecha(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        if (checkDay(dia, mes)){
            this.dia = dia;
        } else{
            this.dia = 1;
        }

        if (checkMonth(mes)){
            this.mes = mes;
        } else {
            this.mes = 1;
        }

        if (checkYear(ano)){
            this.ano = ano;
        } else {
            this.ano = 1970;
        }
        if (checkHour(hora)){
            this.hora = hora;
        } else {
            this.hora = 0;
        }
        if(checkMinute(minuto)){
            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
        if(checkMinute(segundo)){
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }
    }

    private boolean checkDay(int day, int month) {
        boolean comprobacion;
        switch (month) {
            case 1:
            case 3:
            case 4:
            case 7:
            case 8:
            case 10:
            case 12:
                comprobacion = (day >= 1 && day <= 31);
                break;
            case 5:
            case 6:
            case 9:
            case 11:
                comprobacion = (day >= 1 && day <= 30);
                break;
            case 2:

                comprobacion = (day >= 1 && day <= 28);
                break;
            default:
                comprobacion = false;

        }
        return comprobacion;
    }

    private boolean checkYear(int year){
        return year >= 1900 && year <= 2150;
    }
    private boolean checkMonth(int month){
        return month >= 1 && month <= 12;
    }
    private boolean checkHour(int hour){
        return hour >= 0 && hour <= 23;
    }
    private boolean checkMinute(int minute){
        return minute >= 0 && minute <= 59;
    }
    private boolean checkSecond(int second){
        return second >= 0 && second <= 59;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }


    @Override
    public String toString() {

        return "La fecha indicada es la siguiente: " +
                String.format("el dia %02d", dia) +
                " del mes " + mes +
                " del año " + ano +
                String.format(", a las %02d", hora) +
                String.format(":%02d", minuto) +
                String.format(":%02d", segundo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && ano == fecha.ano && hora == fecha.hora && minuto == fecha.minuto && segundo == fecha.segundo;
    }

    public boolean masRecienteQue(Object o){
        if (this.getClass() != o.getClass()){
            return false;
        }
        Fecha cumple = (Fecha) o;
        long f1 = this.numFecha(this.dia, this.mes,this.ano, this.hora, this.minuto, this.segundo);
        long f2 = cumple.numFecha(cumple.dia, cumple.mes,cumple.ano,cumple.hora, cumple.minuto, cumple.segundo);
        long f3 = this.numFecha(((Fecha) o).getDia(), ((Fecha) o).getMes(),((Fecha) o).getAno(),((Fecha) o).getHora(), ((Fecha) o).getMinuto(), ((Fecha) o).getSegundo());
        return f1 > f2;
    }

    public boolean menorQue (Object o){
        if (this.getClass() != o.getClass()){
            return false;
        }
        Fecha cumple = (Fecha) o;
        long f1 = this.numFecha(this.dia, this.mes,this.ano, this.hora, this.minuto, this.segundo);
        long f2 = cumple.numFecha(cumple.dia, cumple.mes,cumple.ano,cumple.hora, cumple.minuto, cumple.segundo);
        long f3 = this.numFecha(((Fecha) o).getDia(), ((Fecha) o).getMes(),((Fecha) o).getAno(),((Fecha) o).getHora(), ((Fecha) o).getMinuto(), ((Fecha) o).getSegundo());
        return f1 < f2;
    }

    public long numFecha (int day, int month, int year, int hour, int minute, int seconds){
        return (long) seconds + (long) minute * 60 + (long) hour *60 *60 + (long) day*60*60*24 + (long) month*60*60*24*30+ (long) year*60*60*24*30*365;
    }
}

