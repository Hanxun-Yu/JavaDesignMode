package com.kedacom.demo.libsingleton;


/**
 * 线程不安全的
 */
public class SingletonThreadUnsafe {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonThreadUnsafe instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonThreadUnsafe() {
    }

    /**
     * 不安全
    /* 静态工程方法，创建实例 ，无同步保护*/
    public static SingletonThreadUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadUnsafe();
        }
        return instance;
    }

    /**
     * 依然不安全
     *
     * instance = new SingletonThreadUnsafe();
     * 这条语句在JVM中分2步执行，无先后顺序，1.赋值instance 2.SingletonThreadUnsafe()构造方法
     * 如果先进行1, 2可能在出synchronized块时还没有结束（在return前是会完成初始化的）
     * 此时其他线程进synchronized块，判断instance不为null，则返回并使用了instance则报错（还未初始化）
     *
     * @return
     */
    public static SingletonThreadUnsafe getInstance2() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new SingletonThreadUnsafe();
                }
            }
        }
        return instance;
    }


    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
