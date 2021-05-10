package com.example.fullshot.general.sample.controller;

import com.example.fullshot.general.sample.model.TestSample;
import com.example.fullshot.general.sample.service.TestSampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@Slf4j
public class TestSampleController {

    @Autowired
    private TestSampleService testSampleService;

//    @GetMapping("/read")
//    @ResponseBody
//    public Optional<TestSample> read( @RequestParam("id") String id) {
//        System.out.println("id = " + id);
//        return testSampleService.read(id);
//    }

    @GetMapping("/read1")
    @ResponseBody
    public Optional<TestSample> read( @RequestParam("id") String id) {
        System.out.println("id = " + id);
        Optional<TestSample> aa = testSampleService.findById(id);
        return aa;
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<TestSample> getMember(@PathVariable("id") String id) {
        Optional<TestSample> aa = testSampleService.findById(id);
        return new ResponseEntity<TestSample>(aa.get(), HttpStatus.OK);
    }



}
