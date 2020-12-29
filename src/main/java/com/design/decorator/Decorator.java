package com.design.decorator;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 11:33
 * @Description:装饰器，子类继承进行装饰
 */
public abstract class Decorator implements Showable {
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
