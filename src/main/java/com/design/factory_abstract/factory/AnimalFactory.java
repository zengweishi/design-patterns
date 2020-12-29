package com.design.factory_abstract.factory;

import com.design.factory_abstract.Unit;
import com.design.factory_abstract.animal.Mammoth;
import com.design.factory_abstract.animal.Roach;
import com.design.factory_abstract.animal.Spitter;
import com.design.factory_abstract.factory.AbstractFactory;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:19
 * @Description:
 */
public class AnimalFactory implements AbstractFactory {
    private int x;
    private int y;

    public AnimalFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Unit createLowClass() {
        Roach roach = new Roach(x,y);
        System.out.println("蟑螂来了");
        return roach;
    }

    @Override
    public Unit createMidClass() {
        Spitter spitter = new Spitter(x,y);
        System.out.println("口水兵来了");
        return spitter;
    }

    @Override
    public Unit createHighClass() {
        Mammoth mammoth = new Mammoth(x, y);
        System.out.println("巨兽来了");
        return mammoth;
    }
}
