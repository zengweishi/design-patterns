package com.design.share;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 10:23
 * @Description:享元模式
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getDrawable("water").draw(10,20);
        factory.getDrawable("road").draw(10,30);
        factory.getDrawable("house").draw(10,40);
        factory.getDrawable("water").draw(20,20);
        factory.getDrawable("road").draw(20,30);
        factory.getDrawable("house").draw(30,30);
    }
}
