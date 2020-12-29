package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:27
 * @Description:左击表达式
 */
public class LeftClick implements Expression {
    private Expression leftDown;
    private Expression leftUp;

    public LeftClick() {
        leftDown = new LeftDown();
        leftUp = new LeftUp();
    }

    @Override
    public void interpret() {
        leftDown.interpret();
        leftUp.interpret();
    }
}
