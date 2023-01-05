package com.todoapp.TodoApp.dto.response;

import lombok.Data;

@Data
public class TaskResponse {

    private Integer id;
    private boolean status;
    private String title;
    private String description;
    private Long idUser;

}
