package com.design.group;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 15:59
 * @Description:文件
 */
public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node node) {
        System.out.println("file不能再添加节点");
    }

    @Override
    protected void ls(int space) {
        super.ls(space);
    }
}
