package com.zone24x7.projects;

public class InvalidUserInputException extends NullPointerException {

    InvalidUserInputException(){
        super("Please re-check your Inputs");
    }
}
