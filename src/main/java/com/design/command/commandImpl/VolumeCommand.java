package com.design.command.commandImpl;

import com.design.command.Command;
import com.design.command.Device;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/25 16:44
 * @Description:音量命令(这边类似策略模式，传入不同类型的device(策略：TV或者Radio)，执行命令)
 */
public class VolumeCommand implements Command {
    private Device device;

    public VolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.volumeUp();
    }

    @Override
    public void unexe() {
        device.volumeDown();
    }
}
