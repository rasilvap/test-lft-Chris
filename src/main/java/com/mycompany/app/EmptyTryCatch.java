package com.mycompany.app;

import java.awt.*;

public class EmptyTryCatch
{
    public void doStuff(Float val1, Float val2, Float val3) {;
        try {
            System.out.println("doing a thing");

            // always throws (But not triggering for some reason)
            throw new RuntimeException("I always do this");
        } catch (Exception ex) {}


        // long to float conversion implicit https://errorprone.info/bugpattern/LongFloatConversion
        Color temp =  new Color(Math.round(val1), Math.round(val2), Math.round(val3));

        // always throws (but not triggering for some reason)
        throw new RuntimeException("WTF: " + temp);
    }


}
