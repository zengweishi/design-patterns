package com.design.factory;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:37
 * @Description:工厂接口，提供SimpleFactory，BossFactory多态实现
 */
public interface Factory {
    public Enemy create(int screenWidth);
}
