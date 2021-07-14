package com.example.designpatterndemo.simplefactorymode;

/**
 * 简单工厂模式
 * 抽象产品类
 * 所有产品类的基类，描述所有子类实例所共有的接口/抽象方法
 */
public abstract class Product {
    public abstract void produce();
}
