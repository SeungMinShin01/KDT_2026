package day09.종합예제.view;

import day09.종합예제.controller.BoardController;

public class BoardView {
    private BoardView() {
    } // 1.

    private static final BoardView instance = new BoardView();

    public static BoardView getinstance() {
        return instance;
    }

    private BoardController bc = BoardController.getinstance();
}
