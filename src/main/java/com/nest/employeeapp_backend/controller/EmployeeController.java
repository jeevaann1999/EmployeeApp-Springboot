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
    @GetMapping("/search")
    public  String Searchpage(){
        return  "Welcome to the search page";
    }
    @GetMapping("/edit")
    public  String Editpage(){
        return  "Welcome to the edit page";
    }
    @GetMapping("/view")
    public String ViewAllPage(){
        return  "Welcome to the view all page";
    }
}
