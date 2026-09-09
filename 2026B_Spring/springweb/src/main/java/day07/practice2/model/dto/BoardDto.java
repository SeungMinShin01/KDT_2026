package day07.practice2.model.dto;

import java.util.ArrayList;
import java.util.List;

import day07.practice2.model.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BoardDto {
    private Integer id;
    private String author;
    private String password;
    private String content;

    @Builder.Default
    private List<CommentDto> comments = new ArrayList<>();

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .author(this.author)
                .password(this.password)
                .content(this.content)
                .build();
    }

    public static BoardDto from(BoardEntity entity) {
        return BoardDto.builder()
                .id(entity.getBoardId())
                .author(entity.getAuthor())
                .content(entity.getContent())
                .build();
    }
}
