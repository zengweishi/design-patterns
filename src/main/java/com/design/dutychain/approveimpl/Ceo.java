package com.design.dutychain.approveimpl;

import com.design.dutychain.Approver;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 18:00
 * @Description:
 */
public class Ceo extends Approver {
    public Ceo(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount > 10000) {
            System.out.println("审批驳回，驳回人："+name);
        } else {
            System.out.println("审批通过，审批人："+name);
        }
    }
}
