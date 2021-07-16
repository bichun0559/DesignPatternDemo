package com.example.designpatterndemo.buildermode;

/**
 * 具体builder类，继承抽象builder类，实现具体的构建产品的方法
 */
public class BuilderImpl extends Builder {
    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setRam(ram);
    }

    @Override
    public void buildMainBoard(String mainboard) {
        mComputer.setMainboard(mainboard);
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
