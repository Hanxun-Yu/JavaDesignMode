package com.kedacom.demo.libfactorymethod.instance;

public class MailSender implements ISender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
