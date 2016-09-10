package com.castrodev.todo.repository;

import com.castrodev.todo.entity.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigocastro on 10/09/16.
 */

public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public List<Task> getTodoList() {
        List<Task> taskList = new ArrayList<>();
        return taskList;
    }
}
