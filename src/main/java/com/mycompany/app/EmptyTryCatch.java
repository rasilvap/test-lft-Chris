package com.mycompany.app;

import java.awt.*;
import java.nio.DoubleBuffer;

public class EmptyTryCatch
{
    private static String SetMeInConstructor;

    private final DoubleBuffer myBuffer = DoubleBuffer.allocate(10);

    public EmptyTryCatch() {
            SetMeInConstructor = "foo-bar-is-static";
    }

    public void doStuff(long val1, long val2, int val3) {;
        try {
            System.out.println("doing a thing");

            // always throws (But not triggering for some reason)
            throw new RuntimeException("I always do this");
        } catch (Exception ex) {}


        // long to float conversion implicit https://errorprone.info/bugpattern/LongFloatConversion
        Color temp =  new Color(Math.round(val1), Math.round(val2), Math.round(val3));

        // always throws (but not triggering for some reason)
	// added a comment to bump PR
        throw new RuntimeException("WTF now: " + temp);
    }

    protected void set(final int index, final float value) {
        myBuffer.put(index, value);
    }

}
