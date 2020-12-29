package com.design.builder;

import com.design.builder.builderImpl.ApartmentBuilderImpl;
import com.design.builder.builderImpl.HouseBuilderImpl;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:45
 * @Description:建造者模式
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilderImpl());
        Building building = director.create();
        System.out.println(building.getResult());

        //更换施工方类型
        director.setBuilder(new ApartmentBuilderImpl());
        Building building1 = director.create();
        System.out.println(building1.getResult());
    }
}
