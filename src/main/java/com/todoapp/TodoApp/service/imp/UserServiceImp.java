package com.todoapp.TodoApp.service.imp;

import com.todoapp.TodoApp.dto.request.UserRequest;
import com.todoapp.TodoApp.dto.response.UserResponse;
import com.todoapp.TodoApp.entity.User;
import com.todoapp.TodoApp.mapper.UserMapper;
import com.todoapp.TodoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public List<UserResponse> getAllUsers(){
        return (List<UserResponse>) userRepository.findAll();
    }

    @Override
    public UserResponse saveUser(UserRequest userRequest){
        // TODO: validar correo
        User user = userMapper.map(userRequest);
        userRepository.save(user);

        return userMapper.map(user);
    }

    public UserResponse updateUser(UserRequest request, Long id){
        Optional<User> response = userRepository.findById(id);
    }



}