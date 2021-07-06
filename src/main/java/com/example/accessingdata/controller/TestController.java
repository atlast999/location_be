package com.example.accessingdata.controller;

import com.example.accessingdata.domain.Test;
import com.example.accessingdata.repository.TestRepository;
import com.example.accessingdata.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/all")
    public List<Test> getRegisterPage() {
        return testService.getAllTest();
    }
}