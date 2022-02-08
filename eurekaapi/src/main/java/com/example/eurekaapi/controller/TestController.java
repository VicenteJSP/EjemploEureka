package com.example.eurekaapi.controller;

import java.util.ArrayList;

import com.example.eurekaapi.models.Test;
import com.example.eurekaapi.services.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping()
    public ArrayList<Test> getTests() {
        return testService.getTests();
    }

    @PostMapping()
    public Test creaTetest(@RequestBody Test test){
        return testService.saveTest(test);
    }
    
}
