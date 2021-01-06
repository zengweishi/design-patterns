package com.design.observer.subject;

import com.design.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 15:07
 * @Description:前台望风的同事
 */
public class Reception implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setAction(String action) {
        this.action = action;
        System.out.println("前台通知："+action);
        notifyObserver();
    }

    @Override
    public String getAction() {
        return action;
    }
}
