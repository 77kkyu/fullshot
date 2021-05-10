package com.example.fullshot.general.sample.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestSampleRepository extends JpaRepository<TestSample, String> {
    // 1. 위의 extends JpaRepository<도메인객체클래스명, pk타입> 설정
    // 2. 기본 내장 기능인 findById, findAll(), save(), delete() 사용 가능한 상태.

    public Optional<TestSample> findById(String id);

}
