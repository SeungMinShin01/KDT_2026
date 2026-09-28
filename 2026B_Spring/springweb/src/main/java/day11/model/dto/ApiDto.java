package day11.model.dto;

import day11.model.entity.ApiEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiDto {
    private Integer idx;
    private String subject;
    private String name;
    private String regdate;
    private String content;

    public static ApiDto from(ApiEntity apiEntitiy) {
        return ApiDto.builder()
                .subject(apiEntitiy.getSubject())
                .name(apiEntitiy.getName())
                .regdate(apiEntitiy.getRegdate())
                .content(apiEntitiy.getContent())
                .build();
    }

    public ApiEntity toEntity() {
        return ApiEntity.builder()
                .name(name)
                .content(content)
                .subject(subject)
                .build();
    }
}
