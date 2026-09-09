package day07.practice2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice2.model.dto.CommentDto;
import day07.practice2.model.entity.BoardEntity;
import day07.practice2.model.entity.CommentEntity;
import day07.practice2.model.repository.BoardRepository;
import day07.practice2.model.repository.CommentRepository;

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
        if (savedEntity.getCommentId() >= 1)
            return true;
        return false;
    }

    // 2. 댓글 삭제
    public boolean commentDelete(Integer commentId, String password) {
        Optional<CommentEntity> optional = commentRepository.findById(commentId);
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
