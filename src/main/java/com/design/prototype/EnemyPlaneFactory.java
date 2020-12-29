package com.design.prototype;

import com.design.factory.Enemy;
import com.design.prototype.entity.EnemyPlane;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 16:29
 * @Description:敌机工厂
 */
public class EnemyPlaneFactory {
    /**
     * 原型机
     */
    private static EnemyPlane enemyPlane = new EnemyPlane();

    /**
     * 获取敌机实例
     * @param x
     * @return
     * @throws CloneNotSupportedException
     */
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        //复制原型机
        EnemyPlane clone = enemyPlane.clone();
        clone.setX(x);
        return clone;
    }
}
