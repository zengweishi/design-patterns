package com.design.decorator;

import com.design.decorator.service.FoundationMakeup;
import com.design.decorator.service.Girl;
import com.design.decorator.service.Lipstick;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 11:43
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //层层装饰
        Lipstick lipstick = new Lipstick(new FoundationMakeup(new Girl()));
        lipstick.show();
    }
}
