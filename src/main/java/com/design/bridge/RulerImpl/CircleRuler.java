package com.design.bridge.RulerImpl;

import com.design.bridge.Ruler;
import com.sun.javafx.css.Rule;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:24
 * @Description:原型尺子
 */
public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("圆形");
    }
}
