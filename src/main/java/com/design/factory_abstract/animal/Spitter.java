package com.design.factory_abstract.animal;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:08
 * @Description:外星毒液口水兵
 */
public class Spitter extends Unit {
    public Spitter(int x, int y) {
        super(60, 70, 80, x, y);
    }

    @Override
    public void show() {
        System.out.println("外星毒液口水兵出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("外星毒液口水兵，攻击力：" + attack);
    }
}
