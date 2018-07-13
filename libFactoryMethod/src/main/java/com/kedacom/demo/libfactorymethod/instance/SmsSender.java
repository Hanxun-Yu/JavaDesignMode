package com.kedacom.demo.libfactorymethod.instance;

public class SmsSender implements ISender {
    @Override
    public void Send() {
        System.out.println("this is smssender!");
    }
}
