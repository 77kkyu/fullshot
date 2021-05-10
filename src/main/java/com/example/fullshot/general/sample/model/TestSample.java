package com.example.fullshot.general.sample.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "test_sample")
public class TestSample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column(name = "ins_tm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insTm;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Date getInsTm() {
//        return insTm;
//    }
//
//    public void setInsTm(Date insTm) {
//        this.insTm = insTm;
//    }
}
