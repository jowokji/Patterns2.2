package com.ehu.pattern.factory.impl;

import com.ehu.pattern.factory.TaskFactory;
import com.ehu.pattern.model.Task;
import com.ehu.pattern.model.impl.ComplexTask;

public class ComplexTaskFactory extends TaskFactory {
    @Override
    public Task createTask(String description) {
        ComplexTask task = new ComplexTask();
        task.setDescription(description);
        return task;
    }
}