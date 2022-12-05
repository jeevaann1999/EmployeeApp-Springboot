package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String EmployeeWelcomepage(){
        return  "Welcome to the website";
    }
    @PostMapping("/add")
    public  String EmployeeAddpage(){
        return "Welcome to the add page";
    }
    @PostMapping("/search")
    public  String EmployeeSearchpage(){
        return  "Welcome to the search page";
    }
    @PostMapping("/edit")
    public  String EmployeeEditpage(){
        return  "Welcome to the edit page";
    }
    @GetMapping("/view")
    public String ViewAllPage(){
        return  "Welcome to the view all page";
    }
    @PostMapping("/delete")
    public String EmployeeDeletepage(){
        return "Welcome to the delete page";
    }
}
