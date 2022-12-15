package com.todoapp.TodoApp.entity;

import javax.persistence.*;

public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private boolean status;

    private String title;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private UserEntity User;
}
