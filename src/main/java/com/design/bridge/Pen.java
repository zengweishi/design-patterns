package com.design.bridge;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:26
 * @Description:
 * 与策略模式的策略类有些神似，如果是策略模式，
 * 会在策略类中执行相应实例的策略，
 * 桥接模式这边是抽象一个draw方法供子类实现
 */
public abstract class Pen {
    /**
     * 尺子的引用
     */
    protected Ruler ruler;

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }

    public abstract void draw();
}
