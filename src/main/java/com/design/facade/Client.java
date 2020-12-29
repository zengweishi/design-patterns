package com.design.facade;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 10:21
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.eatServer();
    }
}
