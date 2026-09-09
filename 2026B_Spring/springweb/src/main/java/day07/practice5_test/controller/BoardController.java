package day07.practice5_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.practice5_test.service.BoardService;
import day07.practice5_test.model.dto.BoardDto;

@RestController
@RequestMapping("/api/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 1. 게시글 등록
    @PostMapping("")
    public boolean boardSave(@RequestBody BoardDto boardDto) {
        return boardService.boardSave(boardDto);
    }

    // 2. 게시글 조회
    @GetMapping("")
    public List<BoardDto> boardFindAll() {
        return boardService.boardFindAll();
    }

    // 3. 게시글 삭제
    @DeleteMapping("")
    public boolean boardDelete(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "password") String password) {
        return boardService.boardDelete(id, password);
    }
}
