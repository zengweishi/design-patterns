package com.design.share.service;

import com.design.share.Drawable;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 09:47
 * @Description:
 */
public class Water implements Drawable {
    private String image;

    public Water() {
        this.image = "water";
        System.out.println("磁盘上加载water，耗时0.5s");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在["+x+","+y+"]绘制图片water");
    }
}
