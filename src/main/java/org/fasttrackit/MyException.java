package org.fasttrackit;

public class MyException extends Exception {
    public MyException(){
        super();
        System.out.println("Introduceti un numar mai mare ca 0");
    }
}
