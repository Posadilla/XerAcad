package com.xeridia.fObjetos.cafeteria;

public enum CoffeTypes {
    SOLO("Café solo", 1.2),
    CON_LECHE("Café con leche",1.2),
    CORTADO("Café cortado", 1.2),
    BOMBOM("Café con leche condensada", 1.5);

    private String type;
    private double prize;

    CoffeTypes(String type, double prize){
        this.prize = prize;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrize() {
        return prize;
    }
    public void setPrize(double prize) {
        this.prize = prize;
    }
}
