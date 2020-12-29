package com.design.agency;

import com.design.agency.inter.Internet;
import com.design.agency.impl.Modem;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 11:36
 * @Description:路由器代理类
 */
public class RouterProxy implements Internet {
    private Internet modem;
    private List<String> blackList =  Arrays.asList("电影", "游戏", "音乐", "小说");

    public RouterProxy() {
        //实例化被代理类
        modem = new Modem();
        System.out.println("连接成功");
    }

    @Override
    public void access(String url) {
        for (String str : blackList) {
            if (str.equals(url)) {
                System.out.println("禁止访问：" + url);
                return;
            }
        }
        modem.access(url);
    }
}
