package com.design.state;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 18:12
 * @Description:状态模式
 */
public class Client {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        for (int i = 0;i < 5;i++) {
            switcher.switchOn();
        }
        for (int i = 0;i < 5;i++) {
            switcher.switchOff();
        }

    }
}
