package com.ehu.pattern.model.impl;

import com.ehu.pattern.model.Task;

public class SimpleTask extends Task {
    @Override
    public void execute() {
        System.out.println("Executing SimpleTask: " + description);
    }
}