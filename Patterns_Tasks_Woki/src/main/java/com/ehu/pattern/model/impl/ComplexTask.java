package com.ehu.pattern.model.impl;

import com.ehu.pattern.model.Task;

public class ComplexTask extends Task {
    @Override
    public void execute() {
        System.out.println("Executing ComplexTask: " + description);
    }
}