package com.todoapp.TodoApp.dto.response;

import com.todoapp.TodoApp.entity.Image;
import com.todoapp.TodoApp.entity.Task;
import com.todoapp.TodoApp.enums.Rol;
import lombok.Data;

@Data
public class UserResponse {
     private Long id;
     private String name;
     private String email;
     private String password;
     private Rol rol;

     /* ??
     private Image image;
     private List<Task> tasks;
      */
}