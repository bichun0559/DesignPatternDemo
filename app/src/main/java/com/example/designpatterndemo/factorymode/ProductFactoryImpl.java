package com.example.designpatterndemo.factorymode;

/**
 * 具体工厂类
 * 继承抽象工厂类，根据传入的具体产品类，通过反射获取其实例
 */
public class ProductFactoryImpl extends ProductFactory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product mProduct = null;
        String classname = clz.getName();
        try {
            mProduct = (Product) Class.forName(classname).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (T) mProduct;
    }
}
