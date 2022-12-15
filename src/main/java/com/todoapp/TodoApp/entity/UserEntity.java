package com.todoapp.TodoApp.entity;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

public class UserEntity {
    @OneToMany(cascade = {CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "user")
    private List<TaskEntity> pendingTasks;

    @OneToMany(cascade = {CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "user")
    private List<TaskEntity> completedTasks;
}
