package day07.practice2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.practice2.model.dto.BoardDto;
import day07.practice2.model.dto.CommentDto;
import day07.practice2.model.entity.BoardEntity;
import day07.practice2.model.repository.BoardRepository;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    // 1. 게시글등록
    public boolean boardSave(BoardDto boardDto) {
        BoardEntity boardEntity = boardDto.toEntity();
        BoardEntity savedEntity = boardRepository.save(boardEntity);
        if (savedEntity.getBoardId() >= 1)
            return true;
        return false;
    }

    // 2. 게시글 조회
    public List<BoardDto> boardFindAll() {
        List<BoardEntity> boardEntities = boardRepository.findAll();

        List<BoardDto> boardDtos = new ArrayList<>();
        boardEntities.forEach((boardEntity) -> {
            BoardDto boardDto = BoardDto.from(boardEntity);
            boardEntity.getCommentEntities().forEach((comment) -> {
                CommentDto commentDto = CommentDto.from(comment);
                boardDto.getComments().add(commentDto);
            });
            boardDtos.add(boardDto);
        });
        return boardDtos;
    }

    // 3. 게시글삭제
    public boolean baordDelete(Integer boardId, String password) {
        Optional<BoardEntity> optional = boardRepository.findById(boardId);
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
