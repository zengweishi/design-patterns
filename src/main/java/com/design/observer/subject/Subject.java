package com.design.observer.subject;

import com.design.observer.observer.Observer;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 14:59
 * @Description:通知者
 */
public interface Subject {
    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void delete(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObserver();

    /**
     * 设置通知者行为状态
     * @param action
     */
    public void setAction(String action);

    public String getAction();
}
