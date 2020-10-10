package com.springdocker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Added controller
 */
@RestController
@RequestMapping("/app")
public class MyController {

    @GetMapping
    public String greetings(){
        return "Hello User";
    }

}
