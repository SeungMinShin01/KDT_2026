package day07.pratice5_Repeat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day07.pratice5_Repeat.model.dto.CommentDto;
import day07.pratice5_Repeat.model.entity.BoardEntity;
import day07.pratice5_Repeat.model.dto.BoardDto;
import day07.pratice5_Repeat.model.repository.BoardRepository;

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

    // 2. 게시물 조회
    public List<BoardDto> boardFindAll() {
        List<BoardEntity> boardEntities = new ArrayList<>();

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

    // 3. 게시물 삭제
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
