package com.example.fullshot.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "BOARD")
@Entity
public class BoardModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_NO")
    private Integer boardNo;

    @Lob
    @Column(name = "TITLE")
    private String title;

    @Lob
    @Column(name = "CONTENT")
    private String content;

    @Lob
    @Column(name = "DATE")
    private String date;

    @Builder
    public BoardModel(Integer boardNo, String title, String content, String date) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.date = date;
    }

}
