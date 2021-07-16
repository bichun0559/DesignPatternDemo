package com.example.designpatterndemo.buildermode;

/**
 * 构建产品的导演类
 * 提供一个方法，调用抽象类Builder的抽象方法，规范构建产品的过程
 */
public class Director {
    private Builder mBuilder = null;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public Computer creatorComputer(String cpu, String ram, String mainboard) {
        mBuilder.buildCpu(cpu);
        mBuilder.buildRam(ram);
        mBuilder.buildMainBoard(mainboard);
        return mBuilder.createComputer();
    }
}
