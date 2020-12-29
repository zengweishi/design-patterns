package com.design.command;

import com.design.command.commandImpl.ChannelCommand;
import com.design.command.commandImpl.SwitchCommand;
import com.design.command.commandImpl.VolumeCommand;
import com.design.command.deviceImpl.Radio;
import com.design.command.deviceImpl.TV;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:09
 * @Description:命令模式：控制器封装好各种类别的功能，提供给外部调用，外部真正使用的应该是控制器
 */
public class Client {
    public static void main(String[] args) {
        CommandController commandController = new CommandController();
        TV tv = new TV();
        Radio radio = new Radio();
        commandController.bindOkCommnd(new SwitchCommand(tv));
        commandController.bindChannelCommand(new ChannelCommand(tv));
        commandController.bindVolumeCommand(new VolumeCommand(tv));

        commandController.buttonOKOn();
        commandController.buttonOKOff();
        commandController.buttonChannelUp();
        commandController.buttonChannelDown();
        commandController.buttonVolumeUp();
        commandController.buttonVolumeDown();

        commandController.bindOkCommnd(new SwitchCommand(radio));
        commandController.bindChannelCommand(new ChannelCommand(radio));
        commandController.bindVolumeCommand(new VolumeCommand(radio));

        commandController.buttonOKOn();
        commandController.buttonOKOff();
        commandController.buttonChannelUp();
        commandController.buttonChannelDown();
        commandController.buttonVolumeUp();
        commandController.buttonVolumeDown();
    }
}
