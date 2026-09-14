package day06.activity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_no;
    private String product_name;
    private Integer product_price;

    @OneToMany(mappedBy = "productEntity")
    @ToString.Exclude
    @Builder.Default
    private List<ProductLogEntity> productLogList = new ArrayList<>();

    @OneToMany(mappedBy = "productEntity")
    @ToString.Exclude
    @Builder.Default
    private List<RecipeEntity> recipeList = new ArrayList<>();

    public Integer getBno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBno'");
    }
}