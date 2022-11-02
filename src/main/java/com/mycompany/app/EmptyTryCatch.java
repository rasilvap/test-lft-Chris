package com.mycompany.app;

import java.awt.*;

public class EmptyTryCatch
{
    public void doStuff() {;
        try {
            System.out.println("doing a thing");

            // always throws (But not triggering for some reason)
            throw new RuntimeException("I always do this");
        } catch (Exception ex) {}


        // long to float conversion implicit https://errorprone.info/bugpattern/LongFloatConversion
        Color temp =  new Color(Math.round(18.0), Math.round(0.0), Math.round(18.0));

        // always throws (but not triggering for some reason)
        throw new RuntimeException("WTF: " + temp);
    }
}
