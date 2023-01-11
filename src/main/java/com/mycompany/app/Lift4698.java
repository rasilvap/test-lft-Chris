package com.mycompany.app;
// test for an issue where xlint errors are treated as error prone findings
public class Lift4698
{
    public void test() {
        System.out.println("much foo");

        Derived d = new Derived();
        Base b = (Base) d;

        // redundant cast
        Base c = (Base) new Base();
        System.out.println(b);
        System.out.println(c);
    }
}

