package com.design.agency;

import com.design.agency.impl.Modem;
import com.design.agency.impl.Switch;
import com.design.agency.inter.Internet;
import com.design.agency.inter.Intranet;

import java.lang.reflect.Proxy;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 11:40
 * @Description:代理模式
 */
public class Client {
    public static void main(String[] args) {
        Internet modem = (Internet) Proxy.newProxyInstance(Modem.class.getClassLoader(), Modem.class.getInterfaces(), new KeywordFilterProxy(new Modem()));
        modem.access("www.games.com");
        Intranet switchs = (Intranet) Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(), new KeywordFilterProxy(new Switch()));
        switchs.fileAccess("www.movie.com");
    }
}
