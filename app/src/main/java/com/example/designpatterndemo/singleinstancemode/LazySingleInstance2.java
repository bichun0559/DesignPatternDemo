package com.example.designpatterndemo.singleinstancemode;

/**
 * 饿汉式单例模式2（线程安全）
 * 对getInstance方法加锁
 * 但每次调用getInstance方法都会进行同步，会造成不必要的同步开销
 */
public class LazySingleInstance2 {
    private static LazySingleInstance2 mInstance;
    private LazySingleInstance2() {

    }
    public static synchronized LazySingleInstance2 getInstance() {
        if (mInstance == null) {
            mInstance = new LazySingleInstance2();
        }
        return mInstance;
    }
}
