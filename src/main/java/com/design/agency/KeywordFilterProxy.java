package com.design.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/23 13:43
 * @Description:动态代理类
 */
public class KeywordFilterProxy implements InvocationHandler {

    private List<String> blackKeyList = Arrays.asList("phone","games","movie");

    private Object origin;

    public KeywordFilterProxy(Object origin) {
        //注入被代理模式(调解器或者交换机)
        this.origin = origin;
        System.out.println("开启关键字代理模式");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String string = args[0].toString();
        for (String str : blackKeyList) {
            if (string.contains(str)) {
                System.out.println("禁止访问：" + string);
                return null;
            }
        }
        return method.invoke(origin, args);
    }
}
