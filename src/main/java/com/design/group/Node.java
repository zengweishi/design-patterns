package com.design.group;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 15:57
 * @Description:
 */
public abstract class Node {
    //节点命名
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    /**
     * 添加节点的方法
     */
    protected abstract void add(Node node);

    protected void ls(int space) {
        //当前节点前面应有的空格
        for (int i = 0;i < space;i++) {
            System.out.print("  ");
        }
        //输出当前节点的名称
        System.out.println(name);
    }

    protected void ls() {
        ls(0);
    }
}
