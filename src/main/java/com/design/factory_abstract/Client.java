package com.design.factory_abstract;

import com.design.factory_abstract.factory.AnimalFactory;
import com.design.factory_abstract.factory.HumanFactory;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/24 10:55
 * @Description:抽象工厂模式，工厂中有多个方法，多条产品线
 */
public class Client {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory(10, 10);
        Unit lowClass = humanFactory.createLowClass();
        lowClass.show();
        Unit midClass = humanFactory.createMidClass();
        midClass.show();
        Unit highClass = humanFactory.createHighClass();
        highClass.show();
        AnimalFactory animalFactory = new AnimalFactory(20, 20);
        Unit lowClass1 = animalFactory.createLowClass();
        lowClass1.show();
        Unit midClass1 = animalFactory.createMidClass();
        midClass1.show();
        Unit highClass1 = animalFactory.createHighClass();
        highClass1.show();

        lowClass.attack();
        lowClass1.attack();
        midClass.attack();
        midClass1.attack();
        highClass.attack();
        highClass1.attack();

    }
}
