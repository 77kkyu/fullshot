package com.example.fullshot.general.board.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class boardDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardNo;

    @Column(name = "TITLE", nullable = false, updatable = false)
    private String title;

    @Column(name = "CONTENT")
    private String content;

}
