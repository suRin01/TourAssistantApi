package com.travelassistant.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class testController {
//    @RequestMapping(value ="/hello",method = RequestMethod.GET)
    @GetMapping("hello")
    public String sayHello(){
        return "Hello spring";
    }

    @GetMapping("bye")
    public String sayBye(){
        return "bye spring";
    }
}

