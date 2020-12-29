package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:31
 * @Description:指令集表达式
 */
public class Sequence implements Expression {
    /**
     * 指令集
     */
    private List<Expression> list;

    public Sequence(List<Expression> list) {
        this.list = list;
    }

    @Override
    public void interpret() {
        //解析每条指令
        for (Expression expression : list) {
            expression.interpret();
        }
    }
}
