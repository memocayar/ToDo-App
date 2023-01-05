package com.todoapp.TodoApp.service;

import com.todoapp.TodoApp.dto.request.TaskRequest;
import com.todoapp.TodoApp.dto.response.TaskResponse;

public interface TaskService {

    TaskResponse createTask(TaskRequest request);

    void deleteTask(int id);

    void pending(int id);

    void completed(int id);

    TaskResponse findTaskById(int id);

}
