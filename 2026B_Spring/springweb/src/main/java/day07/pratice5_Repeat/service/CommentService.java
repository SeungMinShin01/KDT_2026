package day07.pratice5_Repeat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.pratice5_Repeat.model.entity.BoardEntity;
import day07.pratice5_Repeat.model.dto.CommentDto;
import day07.pratice5_Repeat.model.entity.CommentEntity;
import day07.pratice5_Repeat.model.repository.BoardRepository;
import day07.pratice5_Repeat.model.repository.CommentRepository;

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
        if (savedEntity.getId() >= 1)
            return true;
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
