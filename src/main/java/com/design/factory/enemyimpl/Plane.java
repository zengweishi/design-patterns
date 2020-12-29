package com.design.factory.enemyimpl;

import com.design.factory.Enemy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:39
 * @Description:
 */
public class Plane extends Enemy {
    /**
     * 初始化坐标
     *
     * @param x
     * @param y
     */
    public Plane(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("plane出现坐标：["+x+","+y+"]，向玩家发起攻击");
    }
}
