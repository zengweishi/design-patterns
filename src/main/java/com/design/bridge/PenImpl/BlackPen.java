package com.design.bridge.PenImpl;

import com.design.bridge.Pen;
import com.design.bridge.Ruler;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:27
 * @Description:
 */
public class BlackPen extends Pen {
    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        ruler.regularize();
    }
}
