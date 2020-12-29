package com.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:45
 * @Description:房屋
 */
public class Building {
    private List<String> list = new ArrayList<>();

    /**
     * 地基
     * @param basement
     */
    public void setBasement(String basement) {
        list.add(basement);
    }

    /**
     * 墙体
     */
    public void setWall(String wall) {
        list.add(wall);
    }

    /**
     * 房顶
     */
    public void setRoof(String roof) {
        list.add(roof);
    }


    public String getResult() {
        String string = new String();
        for (int i = list.size()-1 ; i >=0 ;i--) {
            string = string + list.get(i);
        }
        return string;
    }
}
