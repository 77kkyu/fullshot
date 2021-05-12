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

    public CommonBoardDTO selectBoard(String id) throws Exception {

        Optional<CommonBoardDTO> getBoard = Optional.ofNullable(commonBoardRepository.findById(id).orElseThrow(IllegalAccessError::new));

        return new CommonBoardDTO(getBoard.get());
    }

}
