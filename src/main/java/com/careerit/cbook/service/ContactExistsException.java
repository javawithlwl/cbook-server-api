package com.careerit.cbook.service;

public class ContactExistsException extends RuntimeException{
    public ContactExistsException(String message){
        super(message);
    }
}
