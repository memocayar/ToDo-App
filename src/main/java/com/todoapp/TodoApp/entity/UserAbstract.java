package com.todoapp.TodoApp.entity;

import com.todoapp.TodoApp.enums.Rol;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @OneToOne
    private Image image;
}
