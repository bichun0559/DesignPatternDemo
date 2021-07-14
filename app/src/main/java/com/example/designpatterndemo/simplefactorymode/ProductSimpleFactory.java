package com.example.designpatterndemo.simplefactorymode;

/**
 * 简单工厂类
 * 提供一个静态的生产方法，传入产品类型，根据产品类型实例化不同具体产品类的对象
 */
public class ProductSimpleFactory {
    public static Product createProduct(String type) {
        Product mProduct = null;
        switch (type) {
            case "a":
                mProduct = new ProductA();
                break;
            case "b":
                mProduct = new ProductB();
                break;
            default:
                break;
        }
        return mProduct;
    }
}

/*
简单工厂模式的使用场景：
1.工厂类负责创建的产品对象实例比较少；
2.客户端只需要知道传入工厂类的参数，不关心产品对象创建的逻辑

优点：
客户端只需调用工厂类方法并传入产品类型参数即可创建产品对象，避免了直接在客户端实例化具体产品类对象，降低耦合
缺点：
如果要增加新的具体产品类类型，需要修改工厂类，这违背了开放封闭原则（类、函数、模块应该是可拓展而不可修改的，拓展开放，修改封闭）
 */
