package com.example.designpatterndemo.singleinstancemode;

/**
 * 懒汉式单例模式1
 * 只有在用户调用时才实例化，节约资源，类加载较快，但第一次加载较慢
 * 重点：在多线程下不能正常工作，线程不安全
 * 因为多个线程同时执行到if(mInstance == null),会创建多个实例
 */
public class LazySingleInstance {
    private static LazySingleInstance mInstance;

    private LazySingleInstance() {

    }

    public static LazySingleInstance getInstance() {
        if (mInstance == null) {
            mInstance = new LazySingleInstance();
        }
        return mInstance;
    }
}
