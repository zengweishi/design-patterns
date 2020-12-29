package com.design.adapter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:49
 * @Description:类适配器模式
 */
public class ClassTriDualAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int j, int k) {
        super.electrify(l,k);
    }
}
