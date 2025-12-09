package com.test.example.test.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DoctorController {

    @RequestMapping(value = "/{name}")
    public String getHello(@PathVariable String name){
        return "hello"+ name;
    }
}
