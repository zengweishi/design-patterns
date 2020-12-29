package com.design.factory_abstract.animal;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:08
 * @Description:外星蟑螂兵
 */
public class Roach extends Unit {
    public Roach(int x, int y) {
        super(80, 60, 70, x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂兵出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂兵用爪子挠，攻击力：" + attack);
    }
}
