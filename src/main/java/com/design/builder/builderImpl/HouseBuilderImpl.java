package com.design.builder.builderImpl;

import com.design.builder.Builder;
import com.design.builder.Building;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:56
 * @Description:房屋类型建筑施工方
 */
public class HouseBuilderImpl implements Builder {
    private Building house;

    public HouseBuilderImpl() {
        this.house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("修筑house地基");
        house.setBasement("house地基 ╬╬╬╬╬╬╬╬\n");
    }

    @Override
    public void buildWall() {
        System.out.println("修筑house墙体");
        house.setWall("house墙体｜田｜田 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("修筑house屋顶");
        house.setRoof("house屋顶 ╱◥███◣\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
