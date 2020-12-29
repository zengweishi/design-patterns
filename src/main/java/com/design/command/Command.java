package com.design.command;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:35
 * @Description:命令接口
 */
public interface Command {
    /**
     * 执行命令
     */
    public void exe();

    /**
     * 反执行命令操作
     */
    public void unexe();
}
