package com.example.designpatterndemo.factorymode;

/**
 * 抽象工厂类
 * 定义抽象方法，返回值为Product的泛型子类对象，参数为Product的泛型子类
 */
public abstract class ProductFactory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
