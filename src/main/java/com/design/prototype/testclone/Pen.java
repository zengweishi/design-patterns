package com.design.prototype.testclone;

import lombok.Data;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 15:16
 * @Description:
 */
@Data
public class Pen {
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
