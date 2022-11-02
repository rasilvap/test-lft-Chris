package com.mycompany.app;

public class EmptyTryCatch
{
    public void doStuff() {
        try {
            System.out.println("doing a thing");
            throw new RuntimeException("I always do this");
        } catch (Exception ex) {}
    }
}
