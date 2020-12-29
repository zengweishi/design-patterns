package com.design.factory;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:23
 * @Description:工厂模式，正常工厂中只有一个方法，一条生产线，生产提供你所需要的实例
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        for (int i = 0;i < 5;i++) {
            //生产实例
            Enemy enemy = simpleFactory.create(100);
            enemy.show();
        }
        BossFactory bossFactory = new BossFactory();
        //生产实例
        Enemy enemy = bossFactory.create(100);
        enemy.show();
    }
}
