package com.org.task_management.service;

import com.org.task_management.entity.Task;
import com.org.task_management.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Transactional
    public Task addNewTask(Task task){
        // add business logic later
        return taskRepository.save(task);
    }
}
