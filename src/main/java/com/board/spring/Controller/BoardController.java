package com.board.spring.Controller;

import com.board.spring.DTO.BoardDTO;
import com.board.spring.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/getlist")
    public List<BoardDTO> selectAll() {
        return boardService.selectAll();
    }

    @GetMapping("/getbyidx")
    public BoardDTO selectByIdx(BoardDTO boardDTO) {
        return boardService.selectByIdx(boardDTO);
    }

    @GetMapping("/addone")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOne(BoardDTO boardDTO) {
        boardService.addOne(boardDTO);
    }

}
