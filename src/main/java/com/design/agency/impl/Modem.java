package com.design.agency.impl;

import com.design.agency.inter.Internet;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 11:35
 * @Description:调制解调器-猫
 */
public class Modem implements Internet {

    @Override
    public void access(String url) {
        System.out.println("访问互联网:" + url);
    }
}
