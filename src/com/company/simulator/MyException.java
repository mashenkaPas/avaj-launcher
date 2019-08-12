package com.company.simulator;

public class MyException extends Exception {
    public MyException(){
        super("Invalid simulation count");
        System.out.println("Invalid simulation count");
    }

}
