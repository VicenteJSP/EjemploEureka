package com.example.eurekaapi.services;
import java.util.ArrayList;

import com.example.eurekaapi.models.Test;
import com.example.eurekaapi.repositories.TestRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestRespository testRespository;

    public ArrayList<Test> getTests() {
        return (ArrayList<Test>) testRespository.findAll();
    }

    public Test saveTest(Test test) {
        return testRespository.save(test);
    }
    
}
