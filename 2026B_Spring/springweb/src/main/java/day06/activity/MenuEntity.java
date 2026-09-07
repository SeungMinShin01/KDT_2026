package day06.activity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "menu")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MenuEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menu_no;

    @Column(length = 50)
    private String menu_name;

    private Integer menu_price;

    @OneToMany(mappedBy = "menuEntity")
    @ToString.Exclude
    @Builder.Default
    private List<RecipeEntity> recipeList = new ArrayList<>();

}