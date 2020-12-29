package com.design.Strategy.strategyimpl;

import com.design.Strategy.Strategy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:08
 * @Description:减法策略
 */
public class SubStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
