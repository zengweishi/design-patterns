package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:19
 * @Description:按下左键指令
 */
public class LeftDown implements Expression {

    @Override
    public void interpret() {
        System.out.println("按下鼠标左键");
    }
}
