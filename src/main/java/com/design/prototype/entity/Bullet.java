package com.design.prototype.entity;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 16:25
 * @Description:子弹
 */
public class Bullet implements Cloneable {
    @Override
    public Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }
}
