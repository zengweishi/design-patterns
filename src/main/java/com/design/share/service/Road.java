package com.design.share.service;

import com.design.share.Drawable;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 09:47
 * @Description:
 */
public class Road implements Drawable {
    private String image;

    public Road() {
        this.image = "road";
        System.out.println("磁盘上加载road，耗时0.5s");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在["+x+","+y+"]绘制图片road");
    }
}
