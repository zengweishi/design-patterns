package com.design.state.stateimpl;

import com.design.state.State;
import com.design.state.Switcher;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:45
 * @Description:开状态
 */
public class OnState implements State {
    public void onSwitch(Switcher switcher) {
        System.out.println("灯已为on状态，无需再开");
    }

    public void offSwitch(Switcher switcher) {
        switcher.lampOff();
        switcher.setState(new OffState());
        System.out.println("关灯成功");
    }
}
