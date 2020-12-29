package com.design.decorator.service;

import com.design.decorator.Decorator;
import com.design.decorator.Showable;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 11:38
 * @Description:
 */
public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}
