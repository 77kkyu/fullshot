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

        /* CommonBoardDTO에 객체가 없으면 nosuch에러뜸 그렇기 null이 들어갔을 때 IllegalAccessError Exception을 띄어준다. */
        Optional<CommonBoardDTO> getBoard = Optional.ofNullable(commonBoardRepository.findById(id).orElseThrow(IllegalAccessError::new));

        return new CommonBoardDTO(getBoard.get());
    }

    public CommonBoardDTO findByBoardId(String id) {

        Optional<CommonBoardDTO> getBoardId = Optional.ofNullable(commonBoardRepository.findByBoardId(id));

        return new CommonBoardDTO(getBoardId.get());
    }

}
