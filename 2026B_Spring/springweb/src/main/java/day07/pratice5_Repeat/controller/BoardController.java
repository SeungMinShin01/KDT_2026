package day07.pratice5_Repeat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.pratice5_Repeat.model.dto.BoardDto;
import day07.pratice5_Repeat.service.BoardService;;

@RestController
@RequestMapping("/api/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 1. 등록
    @PostMapping("")
    public boolean boardSave(@RequestBody BoardDto boardDto) {
        return boardService.boardSave(boardDto);
    }

    // 2. 조회
    @GetMapping("")
    public List<BoardDto> boardFindAll() {
        return boardService.boardFindAll();
    }

    // 3. 삭제
    @DeleteMapping("")
    public boolean boardDelete(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "password") String password) {
        return boardService.boardDelete(id, password);
    }
}
