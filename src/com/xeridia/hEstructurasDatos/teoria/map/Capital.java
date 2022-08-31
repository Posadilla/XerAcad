package com.xeridia.hEstructurasDatos.teoria.map;

public class Capital {

    private long citizens;

    private String name;

    public Capital(long citizens,String name){
        this.citizens= citizens;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCitizens() {
        return citizens;
    }
    public void setCitizens(long citizens) {
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return "La capital del país es: " + name + " y la población de esta ciudad  es de: " + citizens + "\n";
    }
}
