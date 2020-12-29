package com.design.interpret;

import com.design.interpret.expressionImpl.*;

import java.util.Arrays;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 11:08
 * @Description:解释器模式
 */
public class Client {
    /**
     * BEGIN             // 脚本开始
     * MOVE 500,600;     // 鼠标移动到坐标(500, 600)
     *  BEGIN LOOP 5     // 开始循环5次
     *      LEFT_CLICK;  // 循环体内单击左键
     *      DELAY 1;     // 每次延时1秒
     *  END;             // 循环体结束
     * RIGHT_DOWN;       // 按下右键
     * DELAY 7200;       // 延时10s
     * END;              // 脚本结束
     */
    public static void main(String[] args) {
        Expression expression = new Sequence(Arrays.asList(new Move(500,600),
                new Repetition(5, new Sequence(Arrays.asList(new LeftClick(), new Delay(1)))),
                new RightDown(),
                new Delay(10)));
        expression.interpret();
    }
}
