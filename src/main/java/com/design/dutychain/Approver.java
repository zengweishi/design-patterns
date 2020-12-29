package com.design.dutychain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/22 17:53
 * @Description:审批人
 */
@Getter
@Setter
public abstract class Approver {
    protected String name;
    /**
     * 更高级别的审批人
     */
    protected Approver nextApprover;

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNextApprover(Approver approver) {
        this.nextApprover = approver;
        //返回下个审批人，链式编程
        return this.nextApprover;
    }

    /**
     * 审批方法
     */
    public abstract void approve(int amount);
}
