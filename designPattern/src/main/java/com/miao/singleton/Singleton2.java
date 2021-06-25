package com.miao.singleton;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:23
 * @description:
 **/
public class Singleton2 {
    // 使用volatile是为了快速去更新 instance 值
    private static volatile Singleton2 instance;

    /* 私有构造方法，防止被实例化 */
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
