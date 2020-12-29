package com.design.iterator;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 18:13
 * @Description:环形结构
 */
public class DrivingRecorder {
    /**
     * 当前位置
     */
    private int index;
    /**
     * 数组容量
     */
    private String[] records = new String[10];

    public void append(String str) {
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = str;
    }

    public void display() {
        for (String record : records) {
            System.out.println(record);
        }
    }

    /**
     * 按插入顺序从新到旧展示
     */
    public void displayInOrder() {
        for(int i = index,loopCount = 0 ; loopCount < records.length ;  i = (i == 0 ? i = 9 : i - 1) , loopCount++) {
            System.out.println(records[i]);
        }
    }

    /**
     * 迭代器的实现
     */
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        private int cursor = index;
        private int loopCount = 0;

        @Override
        public String next() {
            //记录即将返回的游标地址
            int i = cursor;
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }
    }
}
