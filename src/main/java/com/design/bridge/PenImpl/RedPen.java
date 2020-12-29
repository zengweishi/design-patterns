package com.design.bridge.PenImpl;

import com.design.bridge.Pen;
import com.design.bridge.Ruler;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:28
 * @Description:
 */
public class RedPen extends Pen {
    public RedPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("红");
        ruler.regularize();
    }
}
