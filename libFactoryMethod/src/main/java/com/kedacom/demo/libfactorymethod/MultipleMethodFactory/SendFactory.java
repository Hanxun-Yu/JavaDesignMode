package com.kedacom.demo.libfactorymethod.MultipleMethodFactory;

import com.kedacom.demo.libfactorymethod.instance.MailSender;
import com.kedacom.demo.libfactorymethod.instance.ISender;
import com.kedacom.demo.libfactorymethod.instance.SmsSender;

public class SendFactory {

    public ISender produceMail(){
        return new MailSender();
    }

    public ISender produceSms(){
        return new SmsSender();
    }
}