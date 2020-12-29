package com.design.adapter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:48
 * @Description:适配器模式
 */
public class Client {
    public static void main(String[] args) {
        //1.对象适配模式
        System.out.println("1.对象适配模式:");
        TriDualAdapter triDualAdapter = new TriDualAdapter(new TV());
        triDualAdapter.electrify(1,2,3);

        //2.类适配模式
        System.out.println("2.类适配模式");
        ClassTriDualAdapter classTriDualAdapter = new ClassTriDualAdapter();
        classTriDualAdapter.electrify(1,3);
        classTriDualAdapter.electrify(1,2,3);
    }
}
