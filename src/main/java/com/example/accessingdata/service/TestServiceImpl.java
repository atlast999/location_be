package com.example.accessingdata.service;

import com.example.accessingdata.domain.Test;
import com.example.accessingdata.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;

    @Override
    public List<Test> getAllTest() {
        return testRepository.myGetAll();
    }
}