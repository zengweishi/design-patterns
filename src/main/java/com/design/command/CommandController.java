package com.design.command;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:48
 * @Description:控制器封装好各种类别的功能，提供给外部调用
 */
public class CommandController {
    private Command okCommnd;
    private Command channelCommand;
    private Command volumeCommand;

    /**
     * 绑定开关OK键
     * @param okCommnd
     */
    public void bindOkCommnd(Command okCommnd) {
        this.okCommnd = okCommnd;
    }

    /**
     * 绑定频道键
     * @param channelCommand
     */
    public void bindChannelCommand(Command channelCommand) {
        this.channelCommand = channelCommand;
    }

    /**
     * 绑定音量键
     * @param volumeCommand
     */
    public void bindVolumeCommand(Command volumeCommand) {
        this.volumeCommand = volumeCommand;
    }

    public void buttonOKOn() {
        System.out.println("按OK开启");
        okCommnd.exe();
    }

    public void buttonOKOff() {
        System.out.println("按OK关闭");
        okCommnd.unexe();
    }

    public void buttonChannelUp() {
        System.out.println("频道+");
        channelCommand.exe();
    }

    public void buttonChannelDown() {
        System.out.println("频道-");
        channelCommand.unexe();
    }

    public void buttonVolumeUp() {
        System.out.println("音量+");
        volumeCommand.exe();
    }

    public void buttonVolumeDown() {
        System.out.println("音量-");
        volumeCommand.unexe();
    }


}
