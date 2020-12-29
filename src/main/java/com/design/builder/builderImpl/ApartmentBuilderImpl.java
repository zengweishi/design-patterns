package com.design.builder.builderImpl;

import com.design.builder.Builder;
import com.design.builder.Building;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 15:00
 * @Description:公寓类型建筑施工方
 */
public class ApartmentBuilderImpl implements Builder {
    private Building apartment;

    public ApartmentBuilderImpl() {
        this.apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("修筑apartment 地基");
        apartment.setBasement("╚═════════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("修筑apartment 墙体");
        for (int i = 0;i < 10;i++) {
            apartment.setWall("║□ □ □  □ □ □║\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("修筑apartment 屋顶");
        apartment.setRoof("╔═════════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
