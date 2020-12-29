package com.design.factory_abstract.human;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:03
 * @Description:海军陆战队
 */
public class Marine extends Unit {
    public Marine(int x, int y) {
        super(85, 85, 85, x, y);
    }

    @Override
    public void show() {
        System.out.println("海军陆战队出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("海军陆战队用炮轰击，攻击力：" + attack);
    }
}
