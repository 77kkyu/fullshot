package com.example.fullshot.general.commonBoard.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonBoardRepository extends JpaRepository<CommonBoardDTO, String> {

    public CommonBoardDTO findByBoardId(String id);


}
