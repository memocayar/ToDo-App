package com.todoapp.TodoApp.dto.response;

import lombok.Data;
import java.util.List;

@Data
public class ListTaskResponse {
    List<TaskResponse> tasks;

}
