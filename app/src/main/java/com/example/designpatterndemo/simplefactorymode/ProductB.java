package com.example.designpatterndemo.simplefactorymode;

import android.util.Log;

/**
 * 具体产品类，继承抽象产品类
 */
public class ProductB extends Product {
    private static final String TAG = "ProductB";

    @Override
    public void produce() {
        Log.d(TAG, "produce: ");
    }
}
