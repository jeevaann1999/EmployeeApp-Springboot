package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String EmployeeWelcomepage(){
        return  "Welcome to the website";
    }
    @PostMapping(path = "/add",consumes = "application/json",produces="application/json")
    public  String EmployeeAddpage(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyName());
        System.out.println(e.getMobno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "Employee Added Successfully";
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
