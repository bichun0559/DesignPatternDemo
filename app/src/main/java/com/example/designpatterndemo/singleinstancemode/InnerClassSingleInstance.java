package com.example.designpatterndemo.singleinstancemode;

/**
 * 静态内部类单例模式（推荐）
 * 外部类加载时不会立即加载内部类，则不会实例化mInstance，因此不占内存空间
 * 只有在第一次调用getInstance时虚拟机才加载静态内部类，并初始化实例
 * 优点：能确保线程安全性，并保证单例的唯一性，因为虚拟机会保证一个静态类的<clinit>()方法在多线程的情况下，只会被一个线程调用
 * 缺点：不支持传参
 */
public class InnerClassSingleInstance {
    private InnerClassSingleInstance() {

    }

    public static InnerClassSingleInstance getInstance() {
        return SingleInstanceHolder.mInstance;
    }

    public static class SingleInstanceHolder {
        private static final InnerClassSingleInstance mInstance = new InnerClassSingleInstance();
    }
}
