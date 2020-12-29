package com.design.factory;

import com.design.factory.enemyimpl.Plane;
import com.design.factory.enemyimpl.Tank;

import java.util.Random;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:42
 * @Description:
 */
public class SimpleFactory implements Factory {
    private Random random = new Random();

    @Override
    public Enemy create(int screenWidth) {
        Enemy enemy = null;
        //随机生产坦克或飞机实例
        if (random.nextBoolean()) {
            enemy = new Plane(random.nextInt(screenWidth),0);
        } else {
            enemy = new Tank(random.nextInt(screenWidth),0);
        }
        return enemy;
    }
}
