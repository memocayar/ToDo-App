package com.todoapp.TodoApp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean status;

    private String title;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
