package com.design.group;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 15:58
 * @Description:文件夹
 */
public class Folder extends Node {
    private List<Node> list = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node node) {
        list.add(node);
    }

    @Override
    protected void ls(int space) {
        super.ls(space);
        space++;
        for (Node node : list) {
            node.ls(space);
        }
    }

}
