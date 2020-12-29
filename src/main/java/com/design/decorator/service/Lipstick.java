package com.design.decorator.service;

import com.design.decorator.Decorator;
import com.design.decorator.Showable;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 11:41
 * @Description:
 */
public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红(");
        showable.show();
        System.out.print(")");
    }
}
