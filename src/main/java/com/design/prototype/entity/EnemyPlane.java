package com.design.prototype.entity;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 15:03
 * @Description:敌机
 */
public class EnemyPlane implements Cloneable {
    private int x;
    private int y = 0;
    private Bullet bullet;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * 此处开放setX，为了让克隆后的实例重新修改x坐标
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    /**
     * 让敌机飞
     */
    public void fly() {
        y++;
    }

    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
        //先克隆出敌机，其中子弹还未进行克隆。
        EnemyPlane enemyPlane = (EnemyPlane) super.clone();
        //对子弹进行深拷贝
        enemyPlane.setBullet(this.bullet.clone());
        return enemyPlane;
    }



}
