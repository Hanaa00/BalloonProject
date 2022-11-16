package org.example;

public class WordTooLong extends Exception{

    public WordTooLong(){
        super("Word is too long...");
    }
    public WordTooLong(String message){
        super(message);
    }
}
