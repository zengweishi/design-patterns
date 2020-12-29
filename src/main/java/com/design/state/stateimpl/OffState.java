package com.design.state.stateimpl;

import com.design.state.State;
import com.design.state.Switcher;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:45
 * @Description:关状态
 */
public class OffState implements State {
    public void onSwitch(Switcher switcher) {
        switcher.lampOn();
        switcher.setState(new OnState());
        System.out.println("开灯成功");
    }

    public void offSwitch(Switcher switcher) {
        System.out.println("灯已为off状态，无需再关");
    }
}
