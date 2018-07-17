package com.example.libproxy;

public class PersonProxy implements IWalker {
    Person person = new Person();

    public PersonProxy() {

    }

    @Override
    public void walk() {
        System.out.println("before");
        person.walk();
        System.out.println("after");
    }
}
