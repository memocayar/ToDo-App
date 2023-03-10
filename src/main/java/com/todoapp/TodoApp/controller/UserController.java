package com.todoapp.TodoApp.controller;

import com.todoapp.TodoApp.dto.request.UserRequest;
import com.todoapp.TodoApp.dto.response.UserResponse;
import com.todoapp.TodoApp.entity.User;
import com.todoapp.TodoApp.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    UserServiceImp userService;

    @GetMapping("/users")
    public List<UserResponse> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody UserRequest user){
        return this.userService.saveUser(user);
    }

    @PostMapping()
    public User findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

}
