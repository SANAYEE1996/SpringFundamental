package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller                 
@RequestMapping("/controllertest")
public class ControllerTest1{

    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model){
        System.out.println("hello");
        model.addAttribute("name", "홍길동");
        return "test";
    }

}