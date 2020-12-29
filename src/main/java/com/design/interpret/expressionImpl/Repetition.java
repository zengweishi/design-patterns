package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:29
 * @Description:循环指令
 */
public class Repetition implements Expression {
    private int loopNum;
    private Expression expression;

    public Repetition(int loopNum, Expression expression) {
        this.loopNum = loopNum;
        this.expression = expression;
    }

    @Override
    public void interpret() {
        for (int i = 0;i < loopNum;i++) {
            expression.interpret();
        }
    }
}
