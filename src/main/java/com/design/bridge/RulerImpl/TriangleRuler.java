package com.design.bridge.RulerImpl;

import com.design.bridge.Ruler;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:24
 * @Description:三角形尺子
 */
public class TriangleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("三角形");
    }
}
