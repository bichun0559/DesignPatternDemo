package com.example.designpatterndemo.buildermode;

/**
 * 建造者模式
 * 产品类，定义产品属性，并添加set方法
 * 建造者模式的产品类对象一般比较复杂，含有多个属性
 */
public class Computer {
    private String mCpu;
    private String mRam;
    private String mMainboard;

    public void setCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setRam(String mRam) {
        this.mRam = mRam;
    }

    public void setMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }
}
