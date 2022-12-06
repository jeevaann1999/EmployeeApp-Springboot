package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @PostMapping("/")
    public String EmployeeWelcomepage(){
        return  "Welcome to the website";
    }
    @CrossOrigin(origins = "*")
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
        dao.save(e);
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

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewAllPage(){
        return (List<Employee>) dao.findAll();
    }
    @PostMapping("/delete")
    public String EmployeeDeletepage(){
        return "Welcome to the delete page";
    }
}
