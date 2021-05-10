package com.example.fullshot.general.sample.service;

import com.example.fullshot.general.sample.model.TestSample;
import com.example.fullshot.general.sample.model.TestSampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TestSampleService {

    @Autowired
    private TestSampleRepository testSampleRepository;

//    public Optional<TestSample> read(String id) {
//        return testSampleRepository.findById(id);
//    }

    public List<TestSample> findAll() {
        List<TestSample> test = new ArrayList<>();
        testSampleRepository.findAll().forEach(e -> test.add(e));
        return test;
    }

    public Optional<TestSample> findById(String id) {
        Optional<TestSample> test = testSampleRepository.findById(id);
        return test;
    }

}
