package com.example.fullshot.general.commonBoard.service;

import com.example.fullshot.general.commonBoard.model.CommonBoardDTO;
import com.example.fullshot.general.commonBoard.model.CommonBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommonBoardService {


    private final CommonBoardRepository commonBoardRepository;

    public CommonBoardDTO selectBoard(String id) {

        Optional<CommonBoardDTO> getBoard = commonBoardRepository.findById(id);

        return new CommonBoardDTO(getBoard.get());
    }

}
