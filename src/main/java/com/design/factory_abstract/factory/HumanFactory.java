package com.design.factory_abstract.factory;

import com.design.factory_abstract.Unit;
import com.design.factory_abstract.factory.AbstractFactory;
import com.design.factory_abstract.human.Battleship;
import com.design.factory_abstract.human.Marine;
import com.design.factory_abstract.human.Tank;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:19
 * @Description:
 */
public class HumanFactory implements AbstractFactory {
    private int x;
    private int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Unit createLowClass() {
        Marine marine = new Marine(x, y);
        System.out.println("海军陆战队来了");
        return marine;
    }

    @Override
    public Unit createMidClass() {
        Tank tank = new Tank(x, y);
        System.out.println("坦克来了");
        return tank;
    }

    @Override
    public Unit createHighClass() {
        Battleship battleship = new Battleship(x, y);
        System.out.println("航空母舰来了");
        return battleship;
    }
}
