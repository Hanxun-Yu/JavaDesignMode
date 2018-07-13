package com.kedacom.demo.libfactorymethod.ParamsFactory;

import com.kedacom.demo.libfactorymethod.instance.ISender;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description:
 */
public class Test {
    //通过传参，来生产不同的实例
    public static void main(String[]args) {
        SendFactory sendFactory = new SendFactory();
        ISender mailSend = sendFactory.produce("mail");
        ISender smsSend = sendFactory.produce("sms");
    }
}
