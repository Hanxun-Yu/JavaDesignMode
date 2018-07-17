package com.example.libproxy;

public class MyClass {
    public static void main(String[]args) {
        IWalker walker = new PersonProxy();
        walker.walk();
    }
}
