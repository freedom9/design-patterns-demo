package com.freedom.command;

/**
 * @author baijianliang
 * @date 2019/11/19
 * @description
 */
public class RemoteController {

    // 开关按钮的命令数组
    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    // 完成按钮的初始化
    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按开按钮
    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        // 记住这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按关按钮
    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        // 记住这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}