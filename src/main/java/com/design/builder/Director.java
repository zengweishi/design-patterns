package com.design.builder;

import lombok.Data;
import lombok.Setter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 15:02
 * @Description:工程总监，监制建造流程
 */
@Setter
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }



    /**
     * 流程监制
     * @return
     */
    public Building create() {
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        return builder.getBuilding();
    }
}
