package com.board.spring.Service;

import com.board.spring.DTO.BoardDTO;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BoardService {
    List<BoardDTO> selectAll();
    BoardDTO selectByIdx(BoardDTO boardDTO);
    void addOne(BoardDTO boardDTO);
}
