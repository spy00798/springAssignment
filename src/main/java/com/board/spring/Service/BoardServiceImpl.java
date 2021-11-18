package com.board.spring.Service;

import com.board.spring.DAO.BoardDAO;
import com.board.spring.DTO.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BoardService")
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardDAO boardDAO;

    @Override
    public List<BoardDTO> selectAll() {
        return boardDAO.selectAll();
    }

    @Override
    public BoardDTO selectByIdx(BoardDTO boardDTO) {
        return boardDAO.selectByIdx(boardDTO);
    }

    @Override
    public void addOne(BoardDTO boardDTO) {
        boardDAO.addOne(boardDTO);
//        boardDAO.abc123();
    }
}
