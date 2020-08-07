package com.freedom.command;

/**
 * @author baijianliang
 * @date 2019/11/19
 * @description
 */
public class LightOnCommand implements Command {

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}