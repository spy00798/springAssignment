package com.board.spring.DAO;


import com.board.spring.DTO.BoardDTO;

import java.util.List;


public interface BoardDAO {

    List<BoardDTO> selectAll();
    BoardDTO selectByIdx(BoardDTO boardDTO);
    int addOne(BoardDTO boardDTO);
    void abc123();
}
