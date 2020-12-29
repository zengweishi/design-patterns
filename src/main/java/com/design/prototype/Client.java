package com.design.prototype;

import com.design.prototype.entity.EnemyPlane;

import java.util.Random;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 14:49
 * @Description:原型模式
 * 深浅拷贝：https://blog.csdn.net/anzhe6649/article/details/102267057
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        for (int i =0;i < 50;i++) {
            EnemyPlane instance = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
        }
    }
}
