package com.design.observer.observer;

import com.design.observer.subject.Subject;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 15:00
 * @Description:观察者
 */
public abstract class Observer {
    protected String employeeName;
    protected Subject subject;

    public Observer(String employeeName, Subject subject) {
        this.employeeName = employeeName;
        this.subject = subject;
    }

    public abstract void update();
}
