package com.design.factory;

import com.design.factory.enemyimpl.Boss;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 14:45
 * @Description:
 */
public class BossFactory implements Factory {
    @Override
    public Enemy create(int screenWidth) {
        //boss出现在屏幕中间
        return new Boss(screenWidth/2,0);
    }
}
