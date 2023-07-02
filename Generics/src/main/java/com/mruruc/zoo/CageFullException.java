package com.mruruc.zoo;

public class CageFullException extends RuntimeException{
    public CageFullException(String message){
        super(message);
    }
}
