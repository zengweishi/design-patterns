package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:36
 * @Description:按下右键指令
 */
public class RightDown implements Expression {
    @Override
    public void interpret() {
        System.out.println("鼠标点击右键");
    }
}
