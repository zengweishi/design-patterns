package com.design.bridge;

import com.design.bridge.PenImpl.BlackPen;
import com.design.bridge.PenImpl.RedPen;
import com.design.bridge.PenImpl.WhitePen;
import com.design.bridge.RulerImpl.CircleRuler;
import com.design.bridge.RulerImpl.SquareRuler;
import com.design.bridge.RulerImpl.TriangleRuler;
import com.design.template.DevelopImpl01;
import com.design.template.DevelopTemplate;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 13:42
 * @Description:桥接模式
 */
public class Client {
    public static void main(String[] args) {
        new WhitePen(new CircleRuler()).draw();
        new BlackPen(new SquareRuler()).draw();
        new RedPen(new TriangleRuler()).draw();
    }
}
