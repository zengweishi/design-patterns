package com.design.Strategy;

import com.design.Strategy.strategyimpl.AddStrategy;
import com.design.Strategy.strategyimpl.SubStrategy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:23
 * @Description:策略模式-测试计算器
 */
public class Client {
    public static void main(String[] args) {
        //加法策略
        Calculator calculator1 = new Calculator(new AddStrategy());
        int cliculator = calculator1.cliculator(1, 2);
        System.out.println(cliculator);

        //减法策略
        Calculator calculator2 = new Calculator(new SubStrategy());
        int cliculator1 = calculator2.cliculator(2, 1);
        System.out.println(cliculator1);
    }
}
