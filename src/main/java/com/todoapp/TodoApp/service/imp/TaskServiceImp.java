package com.todoapp.TodoApp.service.imp;

import com.todoapp.TodoApp.mapper.TaskMapper;
import com.todoapp.TodoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    TaskMapper mapper;

}
