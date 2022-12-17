package com.todoapp.TodoApp.persistence.entity;

import com.todoapp.TodoApp.persistence.enums.Rol;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @OneToOne
    private Image image;
}
