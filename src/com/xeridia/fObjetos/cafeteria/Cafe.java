package com.xeridia.fObjetos.cafeteria;

public class Cafe {

    private int numCafe = 0;
    private String name;
    private double prize;

    public Cafe ( String name, double prize, int numCafe){
        this.name = name;
        this.numCafe = numCafe;
        this.prize = prize;
    }


    @Override
    public String toString() {
        return "    - Tipo de cafe: "+ name + "Precio: "+ prize + " Número de cafes: " + numCafe;
    }

    public int getNumCafe() {
        return numCafe;
    }
    public void setNumCafe(int numCafe) {
        this.numCafe = numCafe;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cafe)) return false;

        Cafe cafe = (Cafe) o;

        if (getNumCafe() != cafe.getNumCafe()) return false;
        if (Double.compare(cafe.getPrize(), getPrize()) != 0) return false;
        return getName().equals(cafe.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNumCafe();
        result = 31 * result + getName().hashCode();
        temp = Double.doubleToLongBits(getPrize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
