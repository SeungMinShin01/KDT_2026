package day07.practice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import day07.practice2.model.dto.CommentDto;
import day07.practice2.service.CommentService;

@RestController
@RequestMapping("/api/board/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("")
    public boolean commentSave(@RequestBody CommentDto commentDto) {
        return commentService.commentSave(commentDto);
    }

    @DeleteMapping("")
    public boolean commentDelete(
            @RequestParam(name = "commentId") Integer commentId,
            @RequestParam(name = "password") String password) {
        return commentService.commentDelete(commentId, password);
    }
}
