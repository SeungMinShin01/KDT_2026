package day09.종합예제.controller;

import day09.종합예제.dao.BoardDAO;

public class BoardController {
    private BoardController() {
    }

    private static final BoardController instance = new BoardController();

    public static BoardController getinstance() {
        return instance;
    }

    private BoardDAO bd = BoardDAO.getInstance();

}
