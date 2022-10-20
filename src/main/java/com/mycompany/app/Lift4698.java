package com.mycompany.app;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

// test for an issue where xlint errors are treated as error prone findings
public class Lift4698
{
    public void test() {
        System.out.println("much foo");

        Derived d = new Derived();
        Base b = (Base) d;

        // redundant cast, should trigger xlint
        Base c = (Base) (new Base());
        System.out.println(b);
        System.out.println(c);
    }
}







class Base {}
class Derived extends Base {}
