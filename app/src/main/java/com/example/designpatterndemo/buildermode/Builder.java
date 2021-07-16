package com.example.designpatterndemo.buildermode;

/**
 * 建造者模式
 * 抽象Build类,定义构成产品的抽象方法
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildRam(String ram);
    public abstract void buildMainBoard(String mainboard);
    public abstract Computer createComputer();
}
