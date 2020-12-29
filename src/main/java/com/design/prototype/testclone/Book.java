package com.design.prototype.testclone;

import lombok.Data;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 15:16
 * @Description:
 */
@Data
public class Book implements Cloneable {
    private String name;

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
