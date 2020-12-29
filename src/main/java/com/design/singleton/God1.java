package com.design.singleton;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:04
 * @Description:单例模式之懒汉模式
 */
public class God1 {
    //volatile 禁止指令重排序
    private static volatile God1 god;

    //懒汉模式
    public static God1 getInstance() {
        if (god == null) {
            synchronized (God1.class) {
                if (god == null) {
                    god = new God1();
                }
            }
        }
        return god;
    }
}
