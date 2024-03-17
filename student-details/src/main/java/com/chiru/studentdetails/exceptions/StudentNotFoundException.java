package com.chiru.studentdetails.exceptions;

/**
 * @author Chiranjeevi
 */
public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
