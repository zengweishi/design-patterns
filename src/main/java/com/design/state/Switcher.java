package com.design.state;

import com.design.state.stateimpl.OffState;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/21 17:46
 * @Description:开关
 */
public class Switcher {
    //初始化为关的状态
    private State state = new OffState();

    private Lamp lamp = new Lamp();

    public void switchOn() {
        state.onSwitch(this);
    }

    public void switchOff() {
        state.offSwitch(this);
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void lampOn(){
        lamp.on();
    }

    public void lampOff(){
        lamp.off();
    }
}
