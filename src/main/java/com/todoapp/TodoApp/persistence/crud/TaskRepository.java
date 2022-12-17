package com.todoapp.TodoApp.persistence.crud;

import com.todoapp.TodoApp.persistence.entity.Task;
import com.todoapp.TodoApp.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByUser(User user);
    List<Task> findByStatus(boolean status);
}
