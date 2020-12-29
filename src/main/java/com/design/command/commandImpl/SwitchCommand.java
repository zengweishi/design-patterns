package com.design.command.commandImpl;

import com.design.command.Command;
import com.design.command.Device;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:37
 * @Description:开关命令(这边类似策略模式，传入不同类型的device(策略：TV或者Radio)，执行命令)
 */
public class SwitchCommand implements Command {

    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.on();
    }

    @Override
    public void unexe() {
        device.off();
    }
}
