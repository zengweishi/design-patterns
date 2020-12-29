package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:20
 * @Description:松开左键指令
 */
public class LeftUp implements Expression {

    @Override
    public void interpret() {
        System.out.println("松开鼠标左键");
    }
}
