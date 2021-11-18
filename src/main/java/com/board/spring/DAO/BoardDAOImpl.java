package com.board.spring.DAO;

import com.board.spring.DTO.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAOImpl implements BoardDAO{

    private final SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<BoardDTO> selectAll() {
        return sqlSessionTemplate.selectList("com.board.spring.DAO.BoardDAO.selectAll");
    }

    @Override
    public BoardDTO selectByIdx(BoardDTO boardDTO) {
        return sqlSessionTemplate.selectOne("com.board.spring.DAO.BoardDAO.selectByIdx", boardDTO);
    }

    @Override
    public int addOne(BoardDTO boardDTO) {
        return sqlSessionTemplate.insert("com.board.spring.DAO.BoardDAO.addOne", boardDTO);
    }

    @Override
    public void abc123() {
        sqlSessionTemplate.selectList("com.board.spring.DAO.BoardDAO.abc123");
    }
}
