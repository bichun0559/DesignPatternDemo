package com.example.designpatterndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterndemo.factorymode.ProductA;
import com.example.designpatterndemo.factorymode.ProductB;
import com.example.designpatterndemo.factorymode.ProductFactory;
import com.example.designpatterndemo.factorymode.ProductFactoryImpl;
import com.example.designpatterndemo.simplefactorymode.Product;
import com.example.designpatterndemo.simplefactorymode.ProductSimpleFactory;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createProductBySimpleFactory();
        createProductByFactory();
    }

    /**
     * 客户端调用简单工厂类，生产产品，并调用产品实例的方法
     */
    private void createProductBySimpleFactory() {
        //通过ProductSimpleFactory创建productA实例
        Product productA = ProductSimpleFactory.createProduct("a");
        productA.produce();

        //通过ProductSimpleFactory创建productB实例
        Product productB = ProductSimpleFactory.createProduct("b");
        productB.produce();
    }

    /**
     * 客户端调用工厂类，生产产品，并调用产品实例的方法
     */
    private void createProductByFactory() {
        ProductFactory productFactoryA = new ProductFactoryImpl();
        //通过ProductFactory创建ProductA实例
        ProductA productA = productFactoryA.createProduct(ProductA.class);
        productA.produce();

        //通过ProductFactory创建ProductA实例
        ProductB productB = productFactoryA.createProduct(ProductB.class);
        productB.produce();
    }
}