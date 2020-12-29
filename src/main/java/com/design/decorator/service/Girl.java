package com.design.decorator.service;

import com.design.decorator.Showable;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 11:42
 * @Description:
 */
public class Girl implements Showable {
    @Override
    public void show() {
        System.out.print("素颜");
    }
}
