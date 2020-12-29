package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:15
 * @Description:移动指令
 */
public class Move implements Expression {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void interpret() {
        System.out.println("鼠标 move to 【"+x+","+y+"】");
    }
}
