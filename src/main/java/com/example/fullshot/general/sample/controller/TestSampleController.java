package com.example.fullshot.general.sample.controller;

import com.example.fullshot.general.sample.model.TestSample;
import com.example.fullshot.general.sample.service.TestSampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@Slf4j
public class TestSampleController {

    @Autowired
    private TestSampleService testSampleService;

    @GetMapping("/read")
    @ResponseBody
    public Optional<TestSample> read( @RequestParam("id") String id) {
        System.out.println("aaa = " + id);
        return testSampleService.read(id);
    }

}
