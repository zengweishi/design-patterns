package com.design.share;

import com.design.facade.Facade;
import com.design.share.service.House;
import com.design.share.service.Road;
import com.design.share.service.Water;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 10:14
 * @Description:图片工厂
 */
public class Factory {
    private Map<String,Drawable> images;

    public Factory() {
        images = new HashMap<>();
    }

    /**
     * 获取图片元
     * @param image
     * @return
     */
    public Drawable getDrawable(String image) {
        if (!images.containsKey(image)) {
            switch (image) {
                case "water":
                    images.put(image,new Water());
                    break;
                case "road":
                    images.put(image,new Road());
                    break;
                case "house":
                    images.put(image,new House());
                    break;
            }
        }
        return images.get(image);
    }
}
