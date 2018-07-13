package com.kedacom.demo.libsingleton;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description: 饿汉， SingletonHungry类被加载时就会创建实例
 * JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
 */
public class SingletonHungry {
    private static SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }

}
