package com.kedacom.demo.libbuilder;

public class MyClass {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Tom")
                .age(20)
                .build();
    }
}
