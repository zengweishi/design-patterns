package com.design.interpret.expressionImpl;

import com.design.interpret.Expression;
import lombok.Getter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:21
 * @Description:延时指令
 */
@Getter
public class Delay implements Expression {
    private int seconds;

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void interpret() {
        System.out.println("系统延迟："+seconds+"s");
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
