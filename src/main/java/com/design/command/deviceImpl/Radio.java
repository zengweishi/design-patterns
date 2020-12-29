package com.design.command.deviceImpl;

import com.design.command.Device;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:33
 * @Description:
 */
public class Radio implements Device {
    @Override
    public void on() {
        System.out.println("收音机启动");
    }

    @Override
    public void off() {
        System.out.println("收音机关闭");
    }

    @Override
    public void channelUp() {
        System.out.println("收音机频道+");
    }

    @Override
    public void channelDown() {
        System.out.println("收音机频道-");
    }

    @Override
    public void volumeUp() {
        System.out.println("收音机音量+");
    }

    @Override
    public void volumeDown() {
        System.out.println("收音机音量-");
    }
}
