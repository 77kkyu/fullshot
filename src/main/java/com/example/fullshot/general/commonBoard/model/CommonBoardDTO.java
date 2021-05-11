package com.example.fullshot.general.commonBoard.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "common_board")
public class CommonBoardDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private String boardId;

    @NonNull
    private String title;

    @NonNull
    private String content;

    @NonNull
    private Integer hit;

    @NonNull
    @Column(name = "user_id")
    private String userId;

    @NonNull
    @Column(name = "cancel_yn")
    private String cancelYn;

    @Builder
    private CommonBoardDTO(String boardId, @NonNull String title, @NonNull String content, @NonNull Integer hit, @NonNull String userId, @NonNull String cancelYn) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.hit = hit;
        this.userId = userId;
        this.cancelYn = cancelYn;
    }

    public CommonBoardDTO(CommonBoardDTO commonBoardDTO) {
        this.boardId = commonBoardDTO.getBoardId();
        this.title = commonBoardDTO.getTitle();
        this.content = commonBoardDTO.getContent();
        this.hit = commonBoardDTO.getHit();
        this.userId = commonBoardDTO.getUserId();
        this.cancelYn = commonBoardDTO.getCancelYn();
    }
}
