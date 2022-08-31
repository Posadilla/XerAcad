package com.xeridia.iPatrones.teoria.singleton;

public class Bdd {

    private static Bdd instance;
    private int port;
    private String host;
    private String user;
    private String pass;

    private Bdd(int port){
        this.host = "localhost:";
        this.port = port;
        this.user = "user";
        this.pass = "pass";
    }

    public static Bdd getInstance(int port){
        if (instance == null){
            instance = new Bdd(port);
        }
        return instance;
    }

    public String connect(){
        return "Se ha realizado la conexión al puerto "+ this.port;
    }


    @Override
    public String toString() {
        return "Bdd{" +
                "port=" + port +
                ", host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
