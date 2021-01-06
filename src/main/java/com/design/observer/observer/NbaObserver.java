package com.design.observer.observer;

import com.design.observer.subject.Subject;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 15:11
 * @Description:看NBA的同事
 */
public class NbaObserver extends Observer {

    public NbaObserver(String employeeName, Subject subject) {
        super(employeeName, subject);
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(employeeName + "观察到：" +subject.getAction()+"，关闭球赛，开始工作");
    }
}
