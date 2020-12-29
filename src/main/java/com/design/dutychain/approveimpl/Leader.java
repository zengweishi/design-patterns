package com.design.dutychain.approveimpl;

import com.design.dutychain.Approver;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 18:00
 * @Description:
 */
public class Leader extends Approver {
    public Leader(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount > 5000) {
            this.nextApprover.approve(amount);
        } else {
            System.out.println("审批通过，审批人："+name);
        }
    }
}
