package com.freedom.command;

/**
 * @author baijianliang
 * @date 2019/11/19
 * @description
 */
public class Client {

    public static void main(String[] args) {

        LightReceiver light = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // 调用者
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("------按下开灯按钮------");
        remoteController.onButtonWasPushed(0);
//        System.out.println("------按下关灯按钮------");
//        remoteController.offButtonWasPushed(0);
        System.out.println("------按下撤销按钮------");
        remoteController.undoButtonWasPushed();
    }
}
