package com.example.designpatterndemo.singleinstancemode;

/**
 * 饿汉式单例模式
 * 在类加载时就完成了实例化，类加载较慢，获取对象的速度快
 * 基于类加载机制，避免了多线程同步的问题
 * 如果从未使用过这个实例，则会造成内存浪费
 */
public class EhanSingleInstance {
    private static EhanSingleInstance mInstance = new EhanSingleInstance();

    private EhanSingleInstance() {
    }

    public static EhanSingleInstance getInstance() {
        return mInstance;
    }
}
