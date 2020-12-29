package com.design.command;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:30
 * @Description:多功能接口
 */
public interface Device {
    /**
     * 通电
     */
    public void on();

    /**
     * 断电
     */
    public void off();

    /**
     * 频道加
     */
    public void channelUp();

    /**
     * 频道减
     */
    public void channelDown();

    /**
     * 音量加
     */
    public void volumeUp();

    /**
     * 音量减
     */
    public void volumeDown();
}
