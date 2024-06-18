package com.ehu.pattern.factory;

import com.ehu.pattern.model.Task;

public abstract class TaskFactory {
    public abstract Task createTask(String description);
}