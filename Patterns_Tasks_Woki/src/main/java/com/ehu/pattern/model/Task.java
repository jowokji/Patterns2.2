package com.ehu.pattern.model;

import com.ehu.pattern.util.IdGenerator;

public abstract class Task {
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void execute();
}
