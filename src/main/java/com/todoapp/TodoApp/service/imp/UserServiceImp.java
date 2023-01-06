package com.todoapp.TodoApp.service.imp;

import com.todoapp.TodoApp.dto.response.UserResponse;
import com.todoapp.TodoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp {
    @Autowired
    UserRepository userRepository;

    public List<UserResponse> getAllUsers(){
        return (List<UserResponse>) userRepository.findAll();
    }
}
