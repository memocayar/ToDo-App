package com.todoapp.TodoApp.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String mime;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;
}
