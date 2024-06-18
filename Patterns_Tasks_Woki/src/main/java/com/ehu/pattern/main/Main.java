package com.ehu.pattern.main;

import com.ehu.pattern.command.Command;
import com.ehu.pattern.command.impl.TaskCommand;
import com.ehu.pattern.factory.TaskFactory;
import com.ehu.pattern.factory.impl.ComplexTaskFactory;
import com.ehu.pattern.factory.impl.SimpleTaskFactory;
import com.ehu.pattern.flyWeight.TaskFlyweightFactory;
import com.ehu.pattern.model.Task;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        TaskFactory simpleTaskFactory = new SimpleTaskFactory();
        TaskFactory complexTaskFactory = new ComplexTaskFactory();

        TaskFlyweightFactory taskFlyweightFactory = new TaskFlyweightFactory();

        Task task1 = taskFlyweightFactory.getTask("Task 1", simpleTaskFactory);
        Task task2 = taskFlyweightFactory.getTask("Task 2", complexTaskFactory);
        Task task3 = taskFlyweightFactory.getTask("Task 1", simpleTaskFactory);

        Command command1 = new TaskCommand(task1);
        Command command2 = new TaskCommand(task2);
        Command command3 = new TaskCommand(task3);

        command1.execute();
        command2.execute();
        command3.execute();
    }


}
