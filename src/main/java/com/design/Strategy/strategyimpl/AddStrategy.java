package com.design.Strategy.strategyimpl;

import com.design.Strategy.Strategy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:07
 * @Description:加法策略
 */
public class AddStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
