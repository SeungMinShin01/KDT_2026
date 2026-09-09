package day07.pratice5_Repeat.controller;

import day07.pratice5_Repeat.service.CommentService;
import day07.pratice5_Repeat.model.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;
    // 1. 댓글 등록

    public boolean commentSave(@RequestBody CommentDto commentDto) {
        return commentService.commentSave(commentDto);
    }

    // 2. 댓글 삭제
    public boolean commentDelete(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "password") String password) {
        return commentService.commentDelete(id, password);
    }
}
