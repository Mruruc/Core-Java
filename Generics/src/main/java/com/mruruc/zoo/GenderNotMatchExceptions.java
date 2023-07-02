package com.mruruc.zoo;

import javax.naming.CommunicationException;

public class GenderNotMatchExceptions extends CommunicationException {
    public GenderNotMatchExceptions(String message){
        super(message);
    }
}
