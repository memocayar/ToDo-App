package com.todoapp.TodoApp.service.imp;

import com.todoapp.TodoApp.dto.request.TaskRequest;
import com.todoapp.TodoApp.dto.response.TaskResponse;
import com.todoapp.TodoApp.entity.Task;
import com.todoapp.TodoApp.mapper.TaskMapper;
import com.todoapp.TodoApp.repository.TaskRepository;
import com.todoapp.TodoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskResponse createTask(TaskRequest request) {
        Task task = new Task();
        task.setStatus(false);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        // TODO: user ?? no me gusta cambiar a maper
        return taskMapper.map(task);
    }

    @Override
    public void deleteTask(int id) {

    }

    @Override
    public void pending(int id) {

    }

    @Override
    public void completed(int id) {

    }

    @Override
    public TaskResponse findTaskById(int id) {
        return null;
    }
}
