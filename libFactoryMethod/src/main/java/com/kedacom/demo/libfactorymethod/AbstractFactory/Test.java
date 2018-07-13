package com.kedacom.demo.libfactorymethod.AbstractFactory;

import com.kedacom.demo.libfactorymethod.instance.ISender;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description: 抽象工厂方法
 *              扩展时，只需新实现一个工厂类，实现一个sender，也传入这个方法即可
 */
public class Test {
    public static void main(String[]args) {
        ISender mailSender = factoryController(new MailSenderFactory());
        ISender smsSender = factoryController(new SmsSenderFactory());
    }


    /**
     * 如果有这样一个方法来统一控制生产这个动作
     */
    private static ISender factoryController(IFactory factory) {
        return factory.produce();
    }
}
