package day09.종합예제.dao;

import java.util.ArrayList;

import day09.종합예제.dto.BoardDto;

public class BoardDAO {
    private BoardDAO() {
    }

    private static final BoardDAO instance = new BoardDAO();

    public static BoardDAO getInstance() {
        return instance;
    }

    private ArrayList<BoardDto> boardList = new ArrayList<>();

}
