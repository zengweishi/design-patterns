package com.design.Strategy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:20
 * @Description:计算器
 */
public class Calculator {
    /**
     * 传入待办的算法策略
     */
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int cliculator(int a,int b) {
        return strategy.calculate(a,b);
    }
}
