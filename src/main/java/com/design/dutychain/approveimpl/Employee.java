package com.design.dutychain.approveimpl;

import com.design.dutychain.Approver;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 17:56
 * @Description:
 */
public class Employee extends Approver {

    public Employee(String name) {
        super(name);
    }
    @Override
    public void approve(int amount) {
        if (amount > 1000) {
            this.nextApprover.approve(amount);
        } else {
            System.out.println("审批通过，审批人：" + name);
        }
    }
}
