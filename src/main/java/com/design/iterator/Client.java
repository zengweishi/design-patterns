package com.design.iterator;

import java.util.ArrayList;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 17:54
 * @Description:迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        DrivingRecorder drivingRecorder = new DrivingRecorder();
        for(int i = 1;i <= 12;i++) {
            drivingRecorder.append("vedio_"+i);
        }

        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iterator = drivingRecorder.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            if (next.contains("5")) {
                list.add(next);
            }
        }

        System.out.println(list);
    }
}
