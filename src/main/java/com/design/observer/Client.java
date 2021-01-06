package com.design.observer;

import com.design.observer.observer.NbaObserver;
import com.design.observer.observer.StockObserver;
import com.design.observer.subject.Reception;

/**
 * @Author: weishi.zeng
 * @Date: 2021/1/6 14:53
 * @Description:观察者模式
 */
public class Client {
    public static void main(String[] args) {
        Reception reception = new Reception();
        NbaObserver nba = new NbaObserver("nbalover", reception);
        StockObserver stock = new StockObserver("stocklover", reception);
        reception.setAction("boss is back");
    }
}
