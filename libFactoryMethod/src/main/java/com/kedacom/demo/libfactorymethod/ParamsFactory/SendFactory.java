package com.kedacom.demo.libfactorymethod.ParamsFactory;

import com.kedacom.demo.libfactorymethod.instance.MailSender;
import com.kedacom.demo.libfactorymethod.instance.ISender;
import com.kedacom.demo.libfactorymethod.instance.SmsSender;

public class SendFactory {

    public ISender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}