package day07.practice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.practice2.model.dto.BoardDto;
import day07.practice2.service.BoardService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 1 등록
    @PostMapping("")
    public boolean boardSave(@RequestBody BoardDto boardDto) {
        return boardService.boardSave(boardDto);
    }

    // 2. 조회
    @GetMapping("")
    public List<BoardDto> boardFindAll() {
        return boardService.boardFindAll();
    }

    @DeleteMapping("")
    public boolean boardDelete(
            @RequestParam(name = "id") Integer boardId,
            @RequestParam(name = "password") String password) {
        return boardService.baordDelete(boardId, password);
    }

}
