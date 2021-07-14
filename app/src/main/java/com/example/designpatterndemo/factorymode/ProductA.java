package com.example.designpatterndemo.factorymode;

import android.util.Log;

/**
 * 具体产品类，继承抽象产品类
 */
public class ProductA extends Product {
    private static final String TAG = "ProductA";

    @Override
    public void produce() {
        Log.d(TAG, "produce: ");
    }
}
