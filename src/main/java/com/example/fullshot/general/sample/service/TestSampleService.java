package com.example.fullshot.general.sample.service;

import com.example.fullshot.general.sample.model.TestSample;
import com.example.fullshot.general.sample.model.TestSampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TestSampleService {

    @Autowired
    private TestSampleRepository testSampleRepository;

    public Optional<TestSample> read(String id) {
        return testSampleRepository.findById(id);
    }

}
