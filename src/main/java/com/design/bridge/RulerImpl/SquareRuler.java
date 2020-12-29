package com.design.bridge.RulerImpl;

import com.design.bridge.Ruler;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:24
 * @Description:正方形尺子
 */
public class SquareRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("正方形");
    }
}
