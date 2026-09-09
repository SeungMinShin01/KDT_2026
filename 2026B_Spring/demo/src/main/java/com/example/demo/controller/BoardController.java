package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.BoardDto;
import com.example.demo.service.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 1. 등록
    public boolean boardSave(@RequestBody BoardDto boardDto) {
        return boardService.boardSave(boardDto);
    }

    // 2. 조회
    public List<BoardDto> boardFindAll() {
        return boardService.boardFindAll();
    }

    // 3. 삭제
    public boolean boardDelete(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "password") String password) {
        return boardService.boardDelete(id, password);
    }
}
