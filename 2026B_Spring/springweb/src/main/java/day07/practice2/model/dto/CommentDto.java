package day07.practice2.model.dto;

import day07.practice2.model.entity.CommentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CommentDto {
    private Integer id;
    private String author;
    private String password;
    private String content;
    private Integer boardId;

    public CommentEntity toEntity() {
        return CommentEntity.builder()
                .author(this.author)
                .password(this.password)
                .content(this.content)
                .build();
    }

    public static CommentDto from(CommentEntity entity) {
        return CommentDto.builder()
                .id(entity.getCommentId())
                .author(entity.getAuthor())
                .password(entity.getPassword())
                .content(entity.getContent())
                .boardId(entity.getBoardEntity().getBoardId())
                .build();
    }
}
