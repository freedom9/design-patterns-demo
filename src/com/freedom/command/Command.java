package com.freedom.command;

public interface Command {

    public void execute();

    // 撤销操作
    public void undo();
}