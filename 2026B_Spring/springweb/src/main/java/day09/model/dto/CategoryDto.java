package day09.model.dto;

import java.util.ArrayList;
import java.util.List;

import day09.model.entity.CategoryEntity;
import day09.model.entity.ProductsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CategoryDto {
    private Integer cno;
    private String name;
    @Builder.Default
    private List<ReviewsDto> reviewDto = new ArrayList<>();

    public CategoryEntity toEntity() {
        return CategoryEntity.builder()
                .name(this.name)
                .build();
    }

    public static CategoryDto from(CategoryEntity categoryEntity) {
        return CategoryDto.builder()
                .cno(categoryEntity.getCno())
                .name(categoryEntity.getName())
                .build();
    }

    public static CategoryDto from(ProductsEntity productList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'from'");
    }

}