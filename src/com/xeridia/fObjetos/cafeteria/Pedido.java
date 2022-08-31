package com.xeridia.fObjetos.cafeteria;

import java.util.Arrays;

public class Pedido {
    private Cafe cafes[];
    private boolean paraLlevar;
    private int tiposCafe = 5;
    private String name;
    private int totalNum;



    public Pedido ( boolean paraLlevar){
        this.paraLlevar = paraLlevar;
        cafes = new Cafe[tiposCafe];
    }


    public boolean addCoffee (Cafe cafe){
        if (searchCoffe(cafe.getName()) == -1){
            for (int i = 0; i < this.cafes.length; i++) {
                if (this.cafes[i] == null){
                    this.cafes[i] = cafe;
                    return true;
                }
            }
        } else{
            this.cafes[searchCoffe(cafe.getName())].setNumCafe(this.cafes[searchCoffe(cafe.getName())].getNumCafe() + cafe.getNumCafe());
            return true;
        }
        return false;
    }
    public int searchCoffe (String name){
        for (int i = 0; i < this.cafes.length; i++) {
            if (this.cafes[i] != null && this.cafes[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean removeCoffe (String name){
        if (searchCoffe(name) != -1){
            this.cafes[searchCoffe(name)] = null;
            return true;
        }
        return false;
    }
    public int numTotCoffe(){
        int numTot = 0;
        for (int i = 0; i < this.cafes.length; i++) {
            if (this.cafes[i] != null){
                numTot = numTot + this.cafes[i].getNumCafe();
            }

        }
        return numTot;
    }
    public int numBandeja (boolean paraLlevar, int totalNum){
        int numBandejas;
        if (totalNum / 9 >=1){
            numBandejas = (int) Math.ceil(totalNum / 9);
        }else if (totalNum == 0){
            numBandejas = 0;
        } else {
            numBandejas = 1;
        }
        return numBandejas;
    }

    public int tamBandeja (  int totalNum) {
        int tamBandeja = 0;
        if (totalNum >= 5) {
            tamBandeja = 9;
        } else if (totalNum == 1) {
            tamBandeja = 0;
        } else {
            switch (totalNum) {
                case 1:
                    tamBandeja = 0;
                    break;
                case 2:
                    tamBandeja = 2;
                    break;
                case 3:
                case 4:
                    tamBandeja = 4;
            }
        }
        return tamBandeja;
    }


//        int numBandeja = 0;
//        if (paraLlevar) {
//            switch (totalNum) {
//                case 1:
//                    tamBandeja = 0;
//                    break;
//                case 2:
//                    tamBandeja = 2;
//                    break;
//                case 3:
//                case 4:
//                    tamBandeja = 4;
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                    tamBandeja = 9;
//                default:
//                    if (totalNum % 9 == 0) {
//                        tamBandeja = totalNum / 9;
//                    } else {
//                        switch (totalNum % 9) {
//                            case 1:
//                                tamBandeja = totalNum / 9;
//                                ;
//                                break;
//                            case 2:
//                                tamBandeja = totalNum / 9 + 2;
//                                break;
//                            case 3:
//                            case 4:
//                                tamBandeja = 4;
//                            case 5:
//                            case 6:
//                            case 7:
//                            case 8:
//                                tamBandeja = 9;
//                                break;
//                            default:
//                        }
//
//                    }
//
//
//            }
//        }


    public double totPrize (){
        double totPrize = 0;
        for (int i = 0; i < this.cafes.length; i++) {
            if (this.cafes[i] != null && this.cafes[i].getNumCafe() != 0){
                totPrize = totPrize +this.cafes[i].getPrize() * this.cafes[i].getNumCafe();
            }
        }
        return totPrize;
    }
    public void  impirmirTicket(boolean paraLlevar){
        StringBuilder output = new StringBuilder("Factura: \n");
        for (int i = 0; i < CoffeTypes.values().length; i++) {
            if (this.cafes[i] != null) {

                output.append("\n\t- [").append(i).append("]: ").append(CoffeTypes.values()[i].getType()).append(" (")
                        .append(CoffeTypes.values()[i].getPrize()).append(" €).").append(" Cantidad:").append(this.cafes[i].getNumCafe());
            }
        }
        output.append("\n\nEl precio total es de: ").append(totPrize()).append(" €. Y llevas un total de ").append(numTotCoffe()).append(" cafes.");
        if (paraLlevar){
            output.append("\nEl pedido es para llevar, por lo tanto, ");
            if (numBandeja(paraLlevar, this.numTotCoffe()) > 1){
                output.append("se utilizarán ").append(numBandeja(paraLlevar,this.numTotCoffe())).append(" bandejas de 9.");
            } else if (tamBandeja(numTotCoffe()) == 9) {
                output.append("se utilizará una bandeja de 9.");
            } else if (tamBandeja(numTotCoffe()) == 2) {
                output.append("se utilizará una bandeja de 2.");
            }else if (tamBandeja(numTotCoffe()) == 4){
                output.append("se utilizará una bandeja de 4.");
            } else if (tamBandeja(numTotCoffe()) == 0) {
                output.append(" no se utilizará bandeja, ya que solo se toma un café.");
            }
        }
        System.out.println(output);
    }




    @Override
    public String toString() {
        String output = "Pedido: " + Arrays.toString(cafes) + "\nNúmero total: " + numTotCoffe() + "\nPrecio: 0.2%d"+ totPrize() + " euros.";
        if (paraLlevar){
            output += "\nEl pedido es para llevar, y necesitará una bandeja de tamaño: "+ tamBandeja(totalNum);
        }
        return output;
    }


    public Cafe[] getCafes() {
        return cafes;
    }
    public void setCafes(Cafe[] cafes) {
        this.cafes = cafes;
    }
    public boolean isParaLlevar() {
        return paraLlevar;
    }
    public void setParaLlevar(boolean paraLlevar) {
        this.paraLlevar = paraLlevar;
    }
    public int getTiposCafe() {
        return tiposCafe;
    }
    public void setTiposCafe(int tiposCafe) {
        this.tiposCafe = tiposCafe;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalNum() {
        return totalNum;
    }
    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
