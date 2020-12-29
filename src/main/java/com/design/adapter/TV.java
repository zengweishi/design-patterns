package com.design.adapter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:38
 * @Description:使用两项插头的TV
 */
public class TV implements DualPin{
    @Override
    public void electrify(int l, int k) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + k);
    }
}
