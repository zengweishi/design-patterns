package com.design.state;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:45
 * @Description:状态
 */
public interface State {
    public void onSwitch(Switcher switcher);
    public void offSwitch(Switcher switcher);
}
