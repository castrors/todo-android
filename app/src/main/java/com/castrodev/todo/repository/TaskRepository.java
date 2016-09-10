package com.castrodev.todo.repository;

import com.castrodev.todo.entity.Task;

import java.util.List;

/**
 * Created by rodrigocastro on 10/09/16.
 */
public interface TaskRepository {
    List<Task> getTodoList();
}
