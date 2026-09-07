package day06.activity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "recipe")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recipe_no;

    @ManyToOne
    @JoinColumn(name = "product_no")
    @ToString.Exclude
    private ProductEntity productEntity;

    private Integer recipe_order;

    @ManyToOne
    @JoinColumn(name = "menu_no")
    @ToString.Exclude
    private MenuEntity menuEntity;

}
