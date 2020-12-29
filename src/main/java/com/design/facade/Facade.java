package com.design.facade;

import com.design.facade.service.Chef;
import com.design.facade.service.Cleaner;
import com.design.facade.service.VegVendor;
import com.design.facade.service.Waiter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 10:21
 * @Description:
 */
public class Facade {
    private Chef chef;
    private Cleaner cleaner;
    private VegVendor vegVendor;
    private Waiter waiter;

    public Facade() {
        this.vegVendor = new VegVendor();
        //开门前就找菜贩子准备好蔬菜
        vegVendor.sale();
        //当然还得雇佣好各类饭店服务人员
        this.chef = new Chef();
        this.cleaner = new Cleaner();
        this.waiter = new Waiter();
    }

    /**
     * 用餐服务
     */
    public void eatServer() {
        waiter.order();
        chef.cook();
        waiter.serve();
        cleaner.clean();
    }
}
