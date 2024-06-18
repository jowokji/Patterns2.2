package com.ehu.pattern.command.impl;

import com.ehu.pattern.command.Command;
import com.ehu.pattern.model.Task;

public class TaskCommand implements Command {
    private final Task task;

    public TaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.execute();
    }
}