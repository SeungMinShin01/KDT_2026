package com.example.demo.service;

import java.lang.foreign.Linker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.CommentDto;
import com.example.demo.model.entity.BoardEntity;
import com.example.demo.model.entity.CommentEntity;
import com.example.demo.model.repository.BoardRepository;
import com.example.demo.model.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private BoardRepository boardRepository;

    // 1. 댓글 등록
    public boolean commentSave(CommentDto commentDto) {
        CommentEntity commentEntity = commentDto.toEntity();
        Optional<BoardEntity> optional = boardRepository.findById(commentDto.getBoardId());
        if (optional.isPresent()) {
            BoardEntity boardEntity = optional.get();
            commentEntity.setBoardEntity(boardEntity);
        }
        CommentEntity savedEntity = commentRepository.save(commentEntity);
        if (savedEntity.getId() >= 1) {
            return true;
        }
        return false;
    }

    // 2. 댓글삭제
    public boolean commentDelete(Integer id, String password) {
        Optional<CommentEntity> optional = commentRepository.findById(id);
        if (optional.isPresent()) {
            CommentEntity commentEntity = optional.get();
            if (commentEntity.getPassword().equals(password)) {
                commentRepository.delete(commentEntity);
                return true;
            }
        }
        return false;
    }
}
