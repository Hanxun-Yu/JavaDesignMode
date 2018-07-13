package com.kedacom.demo.libsingleton;

/**
 * Created by yuhanxun
 * 2018/7/13
 * description: 懒汉 SingletonLazy被加载时不会创建实例
 *                  只有在getInstance()第一次被调用时才会加载内部类LAZY，则才会创建实例
 */
public class SingletonLazy {
    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        return LAZY.INSTANCE;
    }
    public final static class LAZY {
        public static SingletonLazy INSTANCE = new SingletonLazy();
    }
}
