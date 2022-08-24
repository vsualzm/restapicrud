package com.restapicrud.restapi.controller;

import com.restapicrud.restapi.entities.UserEntity;
import com.restapicrud.restapi.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD SEDERHANA
@RestController
@RequestMapping("/data")
public class TestController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/user")
    public String hello(){
        return "TEST SPRING";
    }

    @PostMapping("/addUser")
    public UserEntity addNewUser(@RequestBody UserEntity param){
        userRepository.save(param);
        return param;
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("getById")
    public UserEntity getById(@RequestParam int id){
        return  userRepository.findById(id).get();
    }
}
