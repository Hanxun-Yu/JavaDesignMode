package com.kedacom.demo.libfactorymethod.MultipleMethodFactory;

import com.kedacom.demo.libfactorymethod.instance.ISender;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description:
 */
public class Test {
    public static void main(String[]args) {
        //通过2个不同工厂方法，来生产不同的实例
        SendFactory sendFactory = new SendFactory();
        ISender mailSend = sendFactory.produceMail();
        ISender smsSend = sendFactory.produceMail();

        //使用静态，工厂类不需要实例化
        ISender mailSend2 = SendStaticFactory.produceMail();
        ISender smsSend2 = SendStaticFactory.produceMail();
    }
}
