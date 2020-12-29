package com.design.dutychain;

import com.design.dutychain.approveimpl.Ceo;
import com.design.dutychain.approveimpl.Employee;
import com.design.dutychain.approveimpl.Leader;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 18:03
 * @Description:责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Approver approver = new Employee("employee");
        approver.setNextApprover(new Leader("leader")).setNextApprover(new Ceo("ceo"));
        approver.approve(500);
        System.out.println("============");
        approver.approve(3000);
        System.out.println("============");
        approver.approve(6000);
        System.out.println("============");
        approver.approve(14000);
        System.out.println("============");
    }
}
