package com.kedacom.demo.libfactorymethod.AbstractFactory;

import com.kedacom.demo.libfactorymethod.instance.ISender;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description:
 */
public interface IFactory {
    ISender produce();
}
