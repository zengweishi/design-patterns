package com.design.factory_abstract.animal;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:08
 * @Description:外星猛犸巨兽
 */
public class Mammoth extends Unit {
    public Mammoth(int x, int y) {
        super(70, 70, 70, x, y);
    }

    @Override
    public void show() {
        System.out.println("外星猛犸巨兽出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("外星猛犸巨兽，攻击力：" + attack);
    }
}
