package com.example.libbridge;

public abstract class AbsPerson implements IPerson{
    String name;
    int age;

    public AbsPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void walk();
}
