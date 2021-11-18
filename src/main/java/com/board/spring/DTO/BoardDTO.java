package com.board.spring.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDTO {
    private int idx;
    private String title;
    private String content;
    private String insertDate;
}
