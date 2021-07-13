package com.example.designpatterndemo.singleinstancemode;

/**
 * 双重检查模式单例
 * 用volatile修饰mInstance，保证多线程可见性
 * getInstance方法对mInstance做两次判空，第一次在同步前，避免不必要的同步
 * 第二次在实例化前判空
 * 线程安全且在一定程度上解决了资源的消耗和和多余的同步开销
 */
public class DclSingleInstance {
    private static volatile DclSingleInstance mInstance;

    private DclSingleInstance() {

    }

    public static DclSingleInstance getInstance() {
        if (mInstance == null) {
            synchronized (DclSingleInstance.class) {
                if (mInstance == null) {
                    mInstance = new DclSingleInstance();
                }
            }
        }
        return mInstance;
    }
}
