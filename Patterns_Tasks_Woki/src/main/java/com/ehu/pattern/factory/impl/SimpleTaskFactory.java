package com.ehu.pattern.factory.impl;

import com.ehu.pattern.factory.TaskFactory;
import com.ehu.pattern.model.Task;
import com.ehu.pattern.model.impl.SimpleTask;

public class SimpleTaskFactory extends TaskFactory {
    @Override
    public Task createTask(String description) {
        SimpleTask task = new SimpleTask();
        task.setDescription(description);
        return task;
    }
}