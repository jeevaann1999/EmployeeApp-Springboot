package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String EmployeeWelcomepage(){
        return  "Welcome to the website";
    }
    @GetMapping("/add")
    public  String EmployeeAddpage(){
        return "Welcome to the add page";
    }
    @GetMapping("/search")
    public  String EmployeeSearchpage(){
        return  "Welcome to the search page";
    }
    @GetMapping("/edit")
    public  String EmployeeEditpage(){
        return  "Welcome to the edit page";
    }
    @GetMapping("/view")
    public String ViewAllPage(){
        return  "Welcome to the view all page";
    }
    @GetMapping("/delete")
    public String EmployeeDeletepage(){
        return "Welcome to the delete page";
    }
}
