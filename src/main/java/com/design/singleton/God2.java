package com.design.singleton;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:11
 * @Description:单例模式之痴汉模式
 */
public class God2 {
    private static final God2 god2 = new God2();
    private God2() {
    }

    public static God2 getInstance() {
        return god2;
    }
}
