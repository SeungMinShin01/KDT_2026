package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.BoardDto;
import com.example.demo.model.dto.CommentDto;
import com.example.demo.model.entity.BoardEntity;
import com.example.demo.model.repository.BoardRepository;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    // 1. 게시글 등록
    public boolean boardSave(BoardDto boardDto) {
        BoardEntity boardEntity = boardDto.toEntity();
        BoardEntity savedEntity = boardRepository.save(boardEntity);
        if (savedEntity.getId() >= 1)
            return true;
        return false;
    }

    // 2. 게시글 조회
    public List<BoardDto> boardFindAll() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtos = new ArrayList<>();
        boardEntities.forEach((boardEntity) -> {
            BoardDto boardDto = BoardDto.from(boardEntity);
            boardEntity.getCommententities().forEach((commentEntity) -> {
                CommentDto commentDto = CommentDto.from(commentEntity);
                boardDto.getComments().add(commentDto);
            });
            boardDtos.add(boardDto);
        });
        return boardDtos;
    }

    // 3. 삭제
    public boolean boardDelete(Integer id, String password) {
        Optional<BoardEntity> optional = boardRepository.findById(id);
        if (optional.isPresent()) {
            BoardEntity boardEntity = optional.get();
            if (boardEntity.getPassword().equals(password)) {
                boardRepository.delete(boardEntity);
                return true;
            }
        }
        return false;
    }
}
