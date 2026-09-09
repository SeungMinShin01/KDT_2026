package day07.practice5_test.service;

import day07.practice5_test.model.repository.CommentRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice5_test.model.entity.CommentEntity;
import day07.practice5_test.model.entity.BoardEntity;
import day07.practice5_test.model.repository.BoardRepository;
import day07.practice5_test.model.dto.CommentDto;

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

    // 2. 댓글 삭제
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
