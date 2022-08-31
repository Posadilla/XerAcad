package com.xeridia.jManejoExcepciones;

public class AgeException extends Exception{
    private int errorCode;
    public AgeException(int errorCode){
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage(){
        StringBuilder errorMsg = new StringBuilder();
        switch (this.errorCode){
            case 1:
                errorMsg.append("Edad negativa");
                break;
            case 2:
                errorMsg.append("Edad demasiado grande.");
                break;
            default:
                errorMsg.append("Error en la edad");
        }
        return errorMsg.toString();
    }


}
