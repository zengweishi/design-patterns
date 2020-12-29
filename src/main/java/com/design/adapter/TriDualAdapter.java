package com.design.adapter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 16:39
 * @Description:适配器（做为两项插头三项插头之间的转接头，即适配器）
 */
public class TriDualAdapter implements TriplePin {
    private DualPin dualPin;

    public TriDualAdapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int j, int k) {
        //电视机只需要2项插座，丢弃地线 j
        dualPin.electrify(l,k);
    }
}
