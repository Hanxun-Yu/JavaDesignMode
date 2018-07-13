package com.kedacom.demo.libbuilder;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description:
 */
public class Person {

    private String name;
    private int age;
    private Person(){};

    public static final class Builder {
        private Person result = new Person();
        public Builder name(String name) {
            result.name = name;
            return this;
        }
        public Builder age(int age) {
            result.age = age;
            return this;
        }

        public Person build() {
            return result;
        }
    }

}
