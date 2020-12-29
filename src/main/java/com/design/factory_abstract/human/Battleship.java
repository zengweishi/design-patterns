package com.design.factory_abstract.human;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:04
 * @Description:航空母舰
 */
public class Battleship extends Unit {
    public Battleship(int x, int y) {
        super(100, 70, 80, x, y);
    }

    @Override
    public void show() {
        System.out.println("航空母舰出现在坐标：[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("航空母舰用炮轰击，攻击力：" + attack);
    }
}
