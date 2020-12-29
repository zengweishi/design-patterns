package com.design.iterator;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/29 09:40
 * @Description:迭代器接口
 */
public interface Iterator<E> {
    /**
     * 获取写一个元素
     * @return
     */
    E next();

    /**
     * 判断是否有下一个
     * @return
     */
    boolean hasNext();
}
