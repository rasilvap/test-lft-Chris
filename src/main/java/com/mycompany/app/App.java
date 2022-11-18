package com.mycompany.app;

public class App {
  public static void main(String [] args) {
    System.out.println("Hello world");

    Derived d = new Derived();
    Base b = (Base) d;

    Base c = (Base) new Base();
    System.out.println(b);
    System.out.println(c);
  }
}

