package com.todoapp.TodoApp.persistence.crud;

import com.todoapp.TodoApp.persistence.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
