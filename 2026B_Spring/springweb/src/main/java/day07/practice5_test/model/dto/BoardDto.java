package day07.practice5_test.model.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import day07.practice5_test.model.entity.BoardEntity;
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
    private LocalDateTime createdAt;
    private LocalDateTime upDatedAt;

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
                .id(entity.getId())
                .author(entity.getAuthor())
                .password(entity.getPassword())
                .content(entity.getContent())
                .createdAt(entity.getCreatedAt())
                .upDatedAt(entity.getUpdatedAt())
                .build();
    }
}
