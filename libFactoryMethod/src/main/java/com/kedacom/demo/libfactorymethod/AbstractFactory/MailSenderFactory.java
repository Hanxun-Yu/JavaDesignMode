package com.kedacom.demo.libfactorymethod.AbstractFactory;

import com.kedacom.demo.libfactorymethod.instance.ISender;
import com.kedacom.demo.libfactorymethod.instance.MailSender;
import com.kedacom.demo.libfactorymethod.instance.SmsSender;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description:
 */
public class MailSenderFactory implements IFactory {
    @Override
    public ISender produce() {
        return new MailSender();
    }
}
