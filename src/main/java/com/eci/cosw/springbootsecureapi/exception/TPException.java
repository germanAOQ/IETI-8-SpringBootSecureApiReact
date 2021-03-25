package com.eci.cosw.springbootsecureapi.exception;

public class TPException extends Exception{
    public static final String USUARIO_NO_PRESENTE = "El usuario no se encuentra registrado";

    public TPException(String message){
        super(message);
    }
}
