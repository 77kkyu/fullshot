package com.example.fullshot.general.sample.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
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

    public String getId() {
        return id;
    }
}
