package com.ehu.pattern.flyWeight;

import com.ehu.pattern.factory.TaskFactory;
import com.ehu.pattern.model.Task;

import java.util.HashMap;
import java.util.Map;

public class TaskFlyweightFactory {
    private final Map<String, Task> tasks = new HashMap<>();

    public Task getTask(String description, TaskFactory factory) {
        if (!tasks.containsKey(description)) {
            tasks.put(description, factory.createTask(description));
        }
        return tasks.get(description);
    }
}