package com.example.fullshot.general.commonBoard.controller;

import com.example.fullshot.general.commonBoard.model.CommonBoardDTO;
import com.example.fullshot.general.commonBoard.service.CommonBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class CommonBoardController {

    private final CommonBoardService commonBoardService;

    @GetMapping("/board")
    public ResponseEntity<CommonBoardDTO> getBoard(@RequestParam("boardId") String boardId) {

        CommonBoardDTO resultBoard = commonBoardService.selectBoard(boardId);
        
        return new ResponseEntity<CommonBoardDTO>(resultBoard, HttpStatus.OK);
    }


}
