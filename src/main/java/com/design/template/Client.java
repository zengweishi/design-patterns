package com.design.template;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 10:04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        DevelopImpl01 developImpl01 = new DevelopImpl01();
        //DevelopImpl01重写各个方法，然后调用父类模板方法
        developImpl01.kickoff();
    }
}
