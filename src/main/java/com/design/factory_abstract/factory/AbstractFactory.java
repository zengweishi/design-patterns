package com.design.factory_abstract.factory;

import com.design.factory_abstract.Unit;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 11:17
 * @Description:抽象工厂
 */
public interface AbstractFactory {
    //制造低级兵种
    public Unit createLowClass();
    //制造中级兵种
    public Unit createMidClass();
    //制造高级兵种
    public Unit createHighClass();
}
