package com.todoapp.TodoApp.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TaskRequest {

    @NotNull(message = "El título no puede estar vacío")
    private String title;

    @Size(min = 0, max = 240, message = "La descripción supera el número de carácteres posibles (240)")
    private String description;

    @NotNull(message = "Usuario no puede estar vacío")
    private Long idUser;
}
