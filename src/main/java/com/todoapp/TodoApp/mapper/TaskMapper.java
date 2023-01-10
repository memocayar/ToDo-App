package com.todoapp.TodoApp.mapper;

import com.todoapp.TodoApp.dto.request.TaskRequest;
import com.todoapp.TodoApp.dto.response.TaskResponse;
import com.todoapp.TodoApp.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    public Task map(TaskRequest request){
        Task task = new Task();
        task.setStatus(false);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        // TODO: task.setUser ???

        return task;
    }

    public TaskResponse map(Task task){
        TaskResponse response = new TaskResponse();

        response.setId(task.getId());
        response.setStatus(task.isStatus());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setIdUser(task.getUser().getId());

        return response;
    }

    public List<TaskResponse> map(List<Task> tasks){
        List<TaskResponse> listResponse = new ArrayList<>();

        for(Task task : tasks){
            listResponse.add(map(task));
        }

        return listResponse;
    }
}
