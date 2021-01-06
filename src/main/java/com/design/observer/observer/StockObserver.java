package com.design.observer.observer;

import com.design.observer.subject.Subject;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 15:11
 * @Description:看大盘行情的同事
 */
public class StockObserver extends Observer {
    public StockObserver(String employeeName, Subject subject) {
        super(employeeName, subject);
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(employeeName + "观察到：" +subject.getAction()+"，关闭大盘行情，开始工作");
    }
}
