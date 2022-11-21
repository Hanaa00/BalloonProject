package org.example;

public class WordTooLongException extends Exception{

    public WordTooLongException(){
        super("Word is too long...");
    }
    public WordTooLongException(String message){
        super(message);
    }
}
