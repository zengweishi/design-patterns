package com.design.agency.impl;

import com.design.agency.inter.Intranet;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 13:41
 * @Description:交换机-实现局域网接口
 */
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
