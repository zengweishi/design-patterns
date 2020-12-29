package com.design.builder;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 14:54
 * @Description:构造者接口(对应施工方)
 */
public interface Builder {
    public void buildBasement();

    public void buildWall();

    public void buildRoof();

    public Building getBuilding();
}
