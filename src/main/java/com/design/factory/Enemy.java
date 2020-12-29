package com.design.factory;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:38
 * @Description:敌人抽象类
 */
public abstract class Enemy {
    protected int x;
    protected int y;

    /**
     * 初始化坐标
     * @param x
     * @param y
     */
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 绘制敌人
     */
    public abstract void show();
}
