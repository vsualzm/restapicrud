package com.restapicrud.restapi.controllers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CRUD SEDERHANA
@RestController
@RequestMapping("/data")
public class TestController {
    @GetMapping("/user")
    public String hello(){
        return "TEST SPRING";
    }
}
