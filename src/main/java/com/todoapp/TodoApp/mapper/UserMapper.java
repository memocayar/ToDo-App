package com.todoapp.TodoApp.mapper;

import com.todoapp.TodoApp.dto.request.UserRequest;
import com.todoapp.TodoApp.dto.response.UserResponse;
import com.todoapp.TodoApp.entity.User;
import com.todoapp.TodoApp.enums.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.ArrayList;
import java.util.List;

public interface UserMapper {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public User map(UserRequest userRequest){
        User user = new User();

        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setRol(Rol.USER);
        // user.setImage(image); ??

        return user;
    }

    public UserResponse map(User user){
        UserResponse response = new UserResponse();

        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        return response;
    }

    public List<UserResponse> map(List<User> users){
        List<UserResponse> listResponse = new ArrayList<>();

        for(User user : users){
            listResponse.add(map(user))
        }

        return listResponse;
    }
}

