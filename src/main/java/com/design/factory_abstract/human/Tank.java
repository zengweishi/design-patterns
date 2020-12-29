package com.design.factory_abstract.human;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:04
 * @Description:坦克
 */
public class Tank extends Unit {
    public Tank(int x, int y) {
        super(80, 90, 70, x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("坦克用炮轰击，攻击力：" + attack);
    }
}
