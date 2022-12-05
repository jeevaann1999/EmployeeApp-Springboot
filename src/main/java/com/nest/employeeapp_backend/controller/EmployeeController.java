package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Welcomepage(){
        return  "Welcome to the website";
    }
    @GetMapping("/add")
    public  String Addpage(){
        return "Welcome to the add page";
    }
}
